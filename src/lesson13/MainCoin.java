package lesson13;

import java.util.HashSet;

public class MainCoin {
    public static void main(String[] args) {

        Coin coin1 = new Coin(10,2.3,"золото",1990);
        Coin coin2 = new Coin(10,2.3,"золото",1990);
        Coin coin3 = new Coin(50,2.5,"золото",1995);
        Coin coin4 = new Coin(100,5.0,"платина",1980);
        Coin coin5 = new Coin(5,2.5,"медь",1955);

        HashSet<Coin> monets = new HashSet<>();
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
