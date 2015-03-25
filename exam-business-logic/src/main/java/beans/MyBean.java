package beans;

import javax.ejb.Local;
import javax.ejb.LocalHome;
import javax.ejb.Remote;
import javax.ejb.Stateful;

@Stateful()
@Remote(IMyBean.class)
public class MyBean implements IMyBean {

    private String test;

    @Override
    public String getTest() {
        return test;
    }

    @Override
    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "test='" + test + '\'' +
                '}';
    }
}
