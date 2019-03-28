package lesson15;

import java.util.HashSet;

public class Main1 {
    public static void main(String[] args) {
        Coin coin = new Coin(2.5,1973,1);
        Coin coin1 = new Coin(3.5,1992,10);
        Coin coin2 = new Coin(1.5,1985,5);
        Coin coin3 = new Coin(0.5,1975,2);
        Coin coin4 = new Coin(2.5,1973,1);

        HashSet<Coin> coins = new HashSet<>();
        coins.add(coin3);
        coins.add(coin);
        coins.add(coin2);
        coins.add(coin1);
        coins.add(coin4);

        System.out.println(coin.equals(coin4));
        for(Coin coinss:coins){
            System.out.println(coinss);
        }
    }
}
