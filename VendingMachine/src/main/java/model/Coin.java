package model;

import java.util.Arrays;
import java.util.List;

public class Coin {
    private static final List<Integer> coins = List.of(10,20,50);

    public boolean validateCoin(Integer coin){
        return coins.contains(coin);
    }
}
