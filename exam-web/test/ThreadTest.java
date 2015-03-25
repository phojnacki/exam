import org.junit.Test;

import java.util.logging.Logger;

public class ThreadTest {

    volatile Logger log = Logger.getLogger("test");

    @Test
    public void testThreads() throws Exception {
        Thread printer = new Thread(new SimplePrinter());
        Thread finisher = new Thread(new Finisher(printer));
        printer.start();
        finisher.start();

        Thread.sleep(4000);


    }

    class Finisher implements Runnable {


        private Thread waitForThread;

        public Finisher(Thread waitForThread) {
            this.waitForThread = waitForThread;
        }

        @Override
        public void run() {
            if (waitForThread != null) {
                try {
                    waitForThread.join();
                } catch (InterruptedException e) {
                    log.info("Finisher interrupted");
                }
                log.info("Wait for thread finished...");

            }

        }
    }

    class SimplePrinter implements Runnable {

        @Override
        public void run() {
            for (int i = 0 ; i < 20 ; i++) {
                log.info("working... "+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    log.info("Thread interrupted");
                }
            }
        }
    }

}
