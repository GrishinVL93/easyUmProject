package javafullschool.part1.logicoperators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int result;

        System.out.println("Введите число");

        firstNumber = sc.nextInt();

        System.out.println("Введите второе число");

        secondNumber = sc.nextInt();

        result = firstNumber + secondNumber;

        System.out.println(result);


        if(firstNumber > secondNumber){
            System.out.println("Первое число больше");
        }else if(firstNumber < secondNumber){
            System.out.println("Второе число больше");
        }
        else {
            System.out.println("Числа равны");
        }
    }
}
