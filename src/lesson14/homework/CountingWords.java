package lesson14.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите исходный текст для подсчета одинаковых слов:");

        String text = sc.nextLine().replaceAll("[^A-Za-zА-Яа-я0-9 ]","").toLowerCase();

        String[] textArray = text.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(String word: textArray){

            if(map.containsKey(word)){
                map.put(word,map.get(word) + 1);
            }
            else {
                map.put(word,1);
            }
        }

        System.out.println("Вывод дубликатов и кол-ва вхождений: ");

        for(Map.Entry<String, Integer> s: map.entrySet()){
            if(s.getValue() > 1){
                System.out.println("Слово - '" + s.getKey() + "' встречается " + s.getValue() + " раз(а)");
            }
        }
    }
}
