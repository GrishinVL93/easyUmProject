package lesson1;

public class HomeWork1 {
    public static void main(String[] args) {

        double a = 4.5;
        double b = 2.5;
        double c = 3.0;
        double d = 5.0;

        /*
         * Вычисление полупериметра 4-угольника*/
        double p = (a + b + c + d) / 2;

        /*
         * Вычисление площади 4-угольника по формуле Брахмагупты(по 4 сторонам)*/
        double area = Math.sqrt((p - a) * (p - b) * (p - c) * (p - d));

        System.out.println(area);
    }
}
