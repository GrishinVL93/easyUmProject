package lesson16.threadsExmaple;

public class Presenter {
    public static void main(String[] args) {
        System.out.println("Начало концерта");


        Singer singer = new Singer();
        singer.start();

        BackSinger backSinger = new BackSinger();
        backSinger.setDaemon(true);
        backSinger.start();

        while (singer.isAlive()){

        }

        System.out.println("Конец концерта");
    }
}
