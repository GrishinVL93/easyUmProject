package specialist.level2.lesson1;

public class DemoThread extends Thread {

    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
