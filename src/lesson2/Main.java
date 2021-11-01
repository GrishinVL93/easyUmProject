package lesson2;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 8;
        int c = 7;

        if ((a==b && b!=c && c!=a)
                || (b==c && a!=c && b!=a)
                || (c==a && a!=b && c!=b)){
            System.out.println("Равнобедренный треугольник");
        }


    }
}
