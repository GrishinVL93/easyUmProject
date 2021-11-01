package javafullschool.part1.homework;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int arrayLength = scanner.nextInt();

        int[] nums = new int[arrayLength];

        for(int i = 0;i<nums.length;i++){
            nums[i] = (int)(Math.random()*(100 - 1));
        }

        for(int i : nums){
            System.out.println(i);
        }
    }
}
