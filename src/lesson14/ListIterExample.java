package lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterExample {
    public static void main(String[] args) {

        String s = "MADAM";

        char[] chars = s.toCharArray();

        List<Character> characterList = new ArrayList<>();
        boolean isPalindrome = true;

        for(char c : chars){
            characterList.add(c);
        }

        ListIterator<Character> iter = characterList.listIterator();
        ListIterator<Character> reverseIter = characterList.listIterator(characterList.size());

        while (iter.hasNext() && reverseIter.hasPrevious()){
            if(!iter.next().equals(reverseIter.previous())){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) System.out.println("Palindrom");

    }
}
