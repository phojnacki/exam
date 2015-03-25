import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.logging.Logger;

public class BigDecimalTest {

    Logger log = Logger.getLogger("testLogger");

    @Test
    public void testBigDecimal() throws Exception {
        BigDecimal a = new BigDecimal("0.123");
        BigDecimal b = new BigDecimal("0.234");
        BigDecimal aScaled = a.setScale(3, RoundingMode.HALF_UP);
        BigDecimal bScaled = b.setScale(3, RoundingMode.HALF_UP);
        BigDecimal mult = aScaled.multiply(bScaled);


        log.info(a.toString());
        log.info(b.toString());
        log.info(mult.toString() + "sc="+mult.scale());

    }


}
