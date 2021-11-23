package lesson16.threadsExmaple;

public class Singer extends Thread {
    private boolean needStop = false;
    @Override
    public void run() {
        int count = 0;
        while (!needStop){
            count++;
            if(count > 3){
                needStop = true;
            }
            for(int i = 0; i < 3; i++){
                System.out.println("Ла---");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized(Monitors.MICROPHONE){
                Monitors.MICROPHONE.notify();
            }

            synchronized(Monitors.MICROPHONE){
                try {
                    Monitors.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }



}
