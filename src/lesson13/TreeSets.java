package lesson13;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        tree.add(8);
        tree.add(4);
        tree.add(5);
        tree.add(6);

        System.out.println(tree);
        for(Integer i : tree){
            System.out.println(i);
        }
    }
}
