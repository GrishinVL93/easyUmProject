package specialist.level2.lesson1;

public class HelloThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello world from " + Thread.currentThread().getName() + "!");
    }
}
