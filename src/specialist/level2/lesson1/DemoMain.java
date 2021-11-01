package specialist.level2.lesson1;

public class DemoMain {
    public static void main(String[] args) {

        DemoThread dt1 = new DemoThread();
        DemoThread dt2 = new DemoThread();


        dt1.start();
        dt2.start();

       /* dt1.join();
        dt2.join();*/

        System.out.println("End of main()");
    }
}
