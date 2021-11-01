package javafullschool.part1.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i <= 1000;i++){
            list.add(i+10);
        }

        for(Integer i : list){
            System.out.println(i);
        }

        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.add("ABC");
        customLinkedList.add("DEF");
        customLinkedList.add("HJI");



        System.out.println(customLinkedList.get(0));

        System.out.println(customLinkedList.size());

    }
}
