package lesson1;

public class HomeWork2 {
    public static void main(String[] args) {
        double a = 3;
        double b = 5;
        double c = 7;

        /*
         * Вычисление полупериметра треугольника
         * */
        double p = (a + b + c) / 2;

        /*
         * Вычисление площади треугольника по формуле Герона(по 3 сторонам)*/
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println(area);

    }
}
