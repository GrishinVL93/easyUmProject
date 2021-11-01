package lesson4;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Какую фигуру посчитаем?");
        System.out.println("1 - Квадрат");
        System.out.println("2 - Треугольник");
        System.out.println("3 - Круг");
        System.out.println("4 - Овал");
        System.out.println("5 - Параллелограмм");

        String figure = sc.nextLine();

        System.out.println("Что посчитать?");

        System.out.println("1 - площадь");
        System.out.println("2 - периметр");
        String action = sc.nextLine();

        if (figure.equalsIgnoreCase("Квадрат") || figure.equals("1")) {
            System.out.println("Введите сторону квадрата:");
            String side = sc.nextLine();
            int a = Integer.parseInt(side);

            if (action.equalsIgnoreCase("площадь") || action.equals("1")) {
                System.out.println("Площадь квадрата: " + (a * a));
            } else {
                System.out.println("Периметр квадрата: " + a * 4);
            }

        } else if (figure.equalsIgnoreCase("Треугольник") || figure.equals("2")) {
            System.out.println("Введите 3 стороны треугольника:");
            String sideA = sc.nextLine();
            int a = Integer.parseInt(sideA);
            String sideB = sc.nextLine();
            int b = Integer.parseInt(sideB);
            String sideC = sc.nextLine();
            int c = Integer.parseInt(sideC);

            if (action.equalsIgnoreCase("площадь") || action.equals("1")) {
                double hp = (a + b + c) / 2.0;
                double s = Math.sqrt(hp * (hp - a) * (hp - b) * (hp - c));
                System.out.println("Площадь треугольника: " + s);
            } else {
                System.out.println("Периметр треугольника: " + (a + b + c));
            }
        } else if (figure.equalsIgnoreCase("Круг") || figure.equals("3")) {
            System.out.println("Введите радиус круга:");
            String sRadius = sc.nextLine();
            int r = Integer.parseInt(sRadius);

            if (action.equalsIgnoreCase("площадь") || action.equals("1")) {

                System.out.println("Площадь круга: " + (Math.PI * r * r));
            } else {
                System.out.println("Длина окружности(круга): " + (2 * Math.PI * r));
            }
        } else if (figure.equalsIgnoreCase("Овал") || figure.equals("4")) {
            System.out.println("Введите малую полуось овала:");
            String axisA = sc.nextLine();
            int a = Integer.parseInt(axisA);
            System.out.println("Введите большую полуось овала:");
            String axisB = sc.nextLine();
            int b = Integer.parseInt(axisB);

            if (action.equalsIgnoreCase("площадь") || action.equals("1")) {

                System.out.println("Площадь овала: " + (Math.PI * a * b));
            } else {
                System.out.println("Длина овала: " + (Math.PI * (a + b)));
            }
        } else if (figure.equalsIgnoreCase("Параллелограмм") || figure.equals("5")) {
            System.out.println("Введите 2 стороны параллелограмма");
            String sideA = sc.nextLine();
            int a = Integer.parseInt(sideA);
            String sideB = sc.nextLine();
            int b = Integer.parseInt(sideB);


            if (action.equalsIgnoreCase("площадь") || action.equals("1")) {

                System.out.println("Введите острый угол(в градусах):");
                String sDegree = sc.nextLine();
                double degree = Double.parseDouble(sDegree);
                double angleRadians = Math.toRadians(degree);

                System.out.println("Площадь параллелограмма: " + (a * b * Math.sin(angleRadians)));
            } else {
                System.out.println("Периметр паралеллограмма: " + (2 * (a + b)));
            }
        }
    }
}
