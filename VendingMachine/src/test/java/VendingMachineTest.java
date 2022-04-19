import model.Coin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.VendingMachine;

import java.util.Map;

public class VendingMachineTest {

    VendingMachine vendingMachine = new VendingMachine(new Coin());

    @Test
    public void testValidInsertCoin()  {
        Integer coin = 10;
        vendingMachine.insertCoin(coin);

        Map<Integer,Integer> coinsBox = vendingMachine.getAllCoins();
        Assertions.assertEquals(1, coinsBox.get(coin));
    }


}
