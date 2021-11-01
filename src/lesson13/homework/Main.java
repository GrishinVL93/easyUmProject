package lesson13.homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Homework hw = new Homework();

        ArrayList<String> list = (ArrayList<String>) hw.asList("abc","def","hji");

        for(String s: list){
            System.out.println(s);
        }

        ArrayList<Double> dlist = new ArrayList<>();
        dlist.add(1.2);
        dlist.add(1.0);
        dlist.add(3.0);
        dlist.add(2.0);

        ArrayList<Double> sorted = (ArrayList<Double>) hw.sortedList(dlist);


        for (Double aDouble : sorted) {
            System.out.println(aDouble);
        }

    }
}
