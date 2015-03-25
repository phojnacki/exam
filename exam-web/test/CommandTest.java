import command.*;
import org.junit.Test;

import java.math.BigDecimal;

public class CommandTest {

    @Test
    public void testCommand() throws Exception {
        Stock stock1 = new Stock("Oracle", new BigDecimal("1000.50"));
        Stock stock2 = new Stock("Microsoft", new BigDecimal("900.50"));

        Command buyOracleCommand = new BuyStock(stock1);
        Command buyMicrosoftCommand = new BuyStock(stock2);
        Command sellMicrosoftCommand = new SellStock(stock2);

        Broker broker = new Broker();

        broker.addCommand(buyOracleCommand);
        broker.addCommand(buyMicrosoftCommand);
        broker.addCommand(sellMicrosoftCommand);

        broker.start();


    }
}
