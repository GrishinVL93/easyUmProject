package lesson7;

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        try {
            t1.initSides(3,5,6);
        } catch (IncorrectSideException e) {
            System.out.println(e.getMessage());
        }
    }
}
