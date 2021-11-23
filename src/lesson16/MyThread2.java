package lesson16;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        for(int i = 1000000; i < 1000200; i++){
            System.out.println(i);

        }
    }
}
