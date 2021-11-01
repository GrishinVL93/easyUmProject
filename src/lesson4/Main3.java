package lesson4;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Какую фигуру посчитаем?");
        System.out.println("1 - Квадрат");
        System.out.println("2 - Треугольник");
        System.out.println("3 - Круг");
        System.out.println("4 - Овал");
        System.out.println("5 - Параллелограмм");

        String figure = sc.nextLine();

        System.out.println(figure);


        System.out.println("Что посчитать?");

        System.out.println("1 - площадь");
        System.out.println("2 - периметр");
        String action = sc.nextLine();

        if(figure.equalsIgnoreCase("Квадрат")  || figure.equals("1")){
            System.out.println("Введите сторону квадрата:");
            String storona = sc.nextLine();
            int a = Integer.parseInt(storona);

            if(action.equalsIgnoreCase("площадь") || action.equals("1")){
                System.out.println("Площадь квадрата: " + (a*a));
            }
            else {
                System.out.println("Периметр квадрата: " + a*4);
            }

        }else if(figure.equalsIgnoreCase("Треугольник")  || figure.equals("2")){

        }else if(figure.equalsIgnoreCase("Круг")  || figure.equals("3")){

        }



    }
}
