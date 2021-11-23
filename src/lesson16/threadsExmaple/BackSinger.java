package lesson16.threadsExmaple;

public class BackSinger extends Thread {



    @Override
    public void run() {

        synchronized(Monitors.MICROPHONE){
            try {
                Monitors.MICROPHONE.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (true){

            for(int i = 0; i < 2; i++){
                System.out.println("----FA");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized(Monitors.MICROPHONE){
                Monitors.MICROPHONE.notify();
            }


        }
    }
}
