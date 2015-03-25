import org.junit.Test;

import java.util.Random;

public class BowBackTest {

    class MyRunnable implements Runnable {
        boolean a = false;

        public synchronized void setA(boolean a) {
            this.a = a;
            notifyAll();
        }

        public void run() {
            waitForEvent();
        }
        public synchronized void waitForEvent() {
            while (!a) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.format("interruptedException");
                }
            }
            System.out.format("after wait");
        }
    }



    @Test
    public void testName() throws Exception {

        MyRunnable r = new MyRunnable() {

        };

        new Thread(r).start();
        Thread.sleep(2000);
        r.setA(true);
        Thread.sleep(2000);

        Random random = new Random();
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));

    }
}
