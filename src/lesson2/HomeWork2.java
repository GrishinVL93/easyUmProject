package lesson2;

public class HomeWork2 {

    public static void main(String[] args) {


        System.out.println("===============================================");
        System.out.println("2 Напечатать на консоль нечетные числа от 7 до 30");

        for (int i = 7; i <= 30; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }

        System.out.println("\n===============================================");
        System.out.println("2 Напечатать на консоль числа от 30 до 0");

        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("\n===============================================");
        System.out.println("3 Напечатать на консоль числа от 40 до 100, которые делятся на 3 и на 5");

        for (int i = 40; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i);
        }

        System.out.println("\n===============================================");
        System.out.println("4 Напечатать сумму чисел от 1 до 10");

        int sum = 0;

        for(int i = 1;i<=10;i++){
            sum+=i;
        }

        System.out.println("Сумма чисел от 1 до 10: " + sum);

        System.out.println("\n===============================================");
        System.out.println("5 Напечатать сумму четных чисел от 100 до 150");

        int evenSum = 0;

        for(int i = 100; i<=150;i++){
            if(i%2 == 0){
                evenSum+=i;
            }
        }
        System.out.println("Сумма четных чисел от 100 до 150 - " + evenSum);
    }
}
