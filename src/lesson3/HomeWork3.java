package lesson3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("\n////////////////////////////////");
        System.out.println("1) Вывести на консоль сумму всех значений:");
        int[] numbers = {2, 5, 8, 14, 5, 3, 1, 4, 6, 8, 34, 21, 12};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        System.out.println("\n////////////////////////////////");
        System.out.println("2) Вывести на консоль фразу  «в массиве больше четных» или в «массиве больше нечетных»");
        System.out.println(Arrays.toString(numbers));
        int evenCount = 0; // счетчик четных чисел
        int oddCount = 0; // счетчик нечетных чисел
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount = evenCount + 1;
            } else {
                oddCount = oddCount + 1;
            }
        }

        if(evenCount > oddCount){
            System.out.println("В массиве больше четных чисел - " + evenCount);
        }
        else {
            System.out.println("В массиве больше нечетных чисел - " + oddCount);
        }

        System.out.println("\n////////////////////////////////");
        System.out.println("3) Вывести на консоль среднее значение всего массива");
        System.out.println(Arrays.toString(numbers));
        int sumForAverage = 0;
        for(int i = 0; i < numbers.length; i++){
            sumForAverage += numbers[i];
        }
        double average = (double) sumForAverage/(numbers.length);
        System.out.printf("%.2f %n",average);

        System.out.println("\n////////////////////////////////");
        System.out.println("4) Из данного массиве сделать «дубликат» массива, " +
                "но только каждая ячейка \n будет сдвинута на одну вправо, " +
                "а последняя ячейка - будет первая при этом");

        int[] copyOfArray = new int[numbers.length];

        for(int i = 1; i <= numbers.length;i++){
            if(i != numbers.length ){
                copyOfArray[i] = numbers[i-1];
            }
            else {
                copyOfArray[0] = numbers[numbers.length-1];
            }
        }

        System.out.println(Arrays.toString(copyOfArray));


    }
}
