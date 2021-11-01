package lesson13.comparable;

import lesson13.Coin;

import java.util.HashSet;

public class MainCoin {
    public static void main(String[] args) {

        lesson13.Coin coin1 = new lesson13.Coin(10,2.3,"золото",1990);
        lesson13.Coin coin2 = new lesson13.Coin(10,2.3,"золото",1990);
        lesson13.Coin coin3 = new lesson13.Coin(50,2.5,"золото",1995);
        lesson13.Coin coin4 = new lesson13.Coin(100,5.0,"платина",1980);
        lesson13.Coin coin5 = new lesson13.Coin(5,2.5,"медь",1955);

        HashSet<lesson13.Coin> monets = new HashSet<>();
        monets.add(coin1);
        monets.add(coin2);
        monets.add(coin3);
        monets.add(coin4);
        monets.add(coin5);

        for(Coin c: monets)
        {
            System.out.println(c);
        }
    }
}
