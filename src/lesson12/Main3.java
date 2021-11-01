package lesson12;

import java.util.ArrayList;
import java.util.Iterator;

public class Main3 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(34);
        numbers.add(2);
        numbers.add(37);
        numbers.add(56);


        for(int i = 0; i < numbers.size();i++){
            System.out.println(numbers.get(i));
        }

        for(Integer n : numbers){
            System.out.println(n);
        }

        for(Iterator<Integer> iter = numbers.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
    }
}
