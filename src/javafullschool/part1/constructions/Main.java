package javafullschool.part1.constructions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mass = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<5;i++){
            mass[i] = sc.nextInt();
        }

        printmass(mass);

    }

    public static void printmass(int[] mass) {
        for (int i = 0; i < mass.length; i++){
            System.out.println("значение " +  i + " элемента: " + mass[i]);
        }
    }
}
