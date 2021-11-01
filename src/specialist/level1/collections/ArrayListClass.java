package specialist.level1.collections;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();

        list.add(3.4);
        list.add(3);
        //list.add(new Object());
        //list.add("Strings");

        for(Number n: list)
        {
            System.out.println(n);
        }

        //реализация двумерного массива через список
        ArrayList<ArrayList<Number>> biglist = new ArrayList<>();
        biglist.add(list);
        biglist.get(0).add(10);

        biglist.add(new ArrayList<Number>());
        biglist.get(1).add(3);
        biglist.get(1).add(4);
        biglist.get(1).add(10);
        biglist.get(1).add(5);

        for(ArrayList<Number> l: biglist){
            for(Number nn: l){
                System.out.print(nn + " ");
            }
            System.out.println();
        }
    }
}
