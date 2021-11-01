package lesson12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> texts = new ArrayList<>();
        texts.add(5);
        texts.add(34);
        texts.add(6);
        texts.add(44);
        texts.set(0,7);


        System.out.println(texts.toString());

    }
}
