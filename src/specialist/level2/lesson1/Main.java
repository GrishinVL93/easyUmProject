package specialist.level2.lesson1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Start of" + Thread.currentThread().getName());

        HelloThread helloThread = new HelloThread();
        helloThread.start();

        try {
            helloThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End of main");

    }
}
