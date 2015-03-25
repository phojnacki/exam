import observer.Subject;
import org.junit.Test;

import java.util.Observable;
import java.util.Observer;

public class ObserverTest {


    @Test
    public void testObserver() throws Exception {

        Subject sub = new Subject();
        sub.addObserver(new Observer() {
            @Override
            public void update(Observable observable, Object argument) {
                System.out.println("Observed a change " + observable + " "+ argument);
            }
        });

        sub.setValue("111");

        sub.setValue("222");
    }

}
