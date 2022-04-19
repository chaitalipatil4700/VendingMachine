package service;

import model.Coin;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    private Map<Integer,Integer> coinBox = new HashMap<>();

    private Coin coinObj;
    public VendingMachine(Coin coinObj){
        this.coinObj=coinObj;
    }

    public void insertCoin(Integer coin) {
        if(coinObj.validateCoin(coin)){
            coinBox.put(coin,coinBox.getOrDefault(coin,0)+1);
        }
    }

    public Map<Integer, Integer> getAllCoins(){
        return Collections.unmodifiableMap(coinBox);
    }






}
