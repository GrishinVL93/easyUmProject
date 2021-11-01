package lesson11;

public class Main {
    public static void main(String[] args) {
        Good good1 = new Good(2000, "Mouse",12);
        Good good2 = new Good(2000, "Mouse", 12);

        System.out.println(good1 == good2);
    }
}
