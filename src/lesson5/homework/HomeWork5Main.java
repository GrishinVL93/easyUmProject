package lesson5.homework;

public class HomeWork5Main {
    public static void main(String[] args) {


        //Вызов 1 метода
        StringMethods.printReverse("Hello");


        //Вызов 2 метода
        System.out.println(StringMethods.countVovelLetters("ABCDEFHJKLMNOPQRSTUVWXYZ"));
        System.out.println(StringMethods.countVovelLetters("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"));

        // Вызов 3 метода

        StringMethods.printByWord("It is a long established fact that a reader" +
                " will be distracted by the readable content");

        // Вызов 4 метода

        int[][] nums = {
                {5,10,5},
                {10,5,15},
                {15,15,10}
        };

        System.out.println(StringMethods.countAverage(nums));




    }
}
