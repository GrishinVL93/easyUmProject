package lesson12.homework;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        MyClass m = new MyClass();
        //1 method - union with duplicates
        /*ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(4);
        list1.add(4);

        list2.add(5);
        list2.add(4);


        ArrayList<Integer> result = (ArrayList<Integer>) m.union(list1,list2);

        for(Integer i : result){
            System.out.println(i);
        }*/

        //2 method - intersect with duplicates
      /*  ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        b.add(3);
        b.add(4);
        b.add(5);

        ArrayList<Integer> intersectRes = (ArrayList<Integer>) m.intersection(a,b);

        for(Integer num: intersectRes){
            System.out.println(num);
        }*/

        //3

        /*HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(7);
        set1.add(4);
        set1.add(5);
        set1.add(3);

        set2.add(5);
        set2.add(6);
        set2.add(4);
        set2.add(7);


        HashSet<Integer> result = (HashSet<Integer>) m.intersectionWithoutDuplicate(set1,set2);

        for(Integer i : result){
            System.out.println(i);
        }*/

        //4 Set Union

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        HashSet<Integer> result = (HashSet<Integer>) m.unionWithoutDuplicate(set1,set2);

        for(Integer i : result){
            System.out.println(i);
        }


    }
}
