package specialist.level1.patterns.clientserver;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;



public class FSServer {
    private String dir;

    private ArrayList<FSMonitor> clients;
    private volatile boolean isWork;

    public FSServer(String dir) {
        this.dir = dir;
        clients = new ArrayList<>();
    }

    public void addClients(FSMonitor client){
        clients.add(client);
    }

    public  void removeClients(FSMonitor client){
        clients.remove(client);
    }

    public void start(){
        isWork = true;
        run();
    }

    public void stop(){
        isWork = false;
    }

    public void run(){
        try {
            WatchService watch = FileSystems.getDefault().newWatchService();
            Paths.get(dir).register(watch, StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE);

            while(isWork){
                WatchKey kEy = watch.take();
                for(WatchEvent event: kEy.pollEvents()){
                    String fName = event.context().toString();
                    int kind = 0;
                    if(event.kind() == StandardWatchEventKinds.ENTRY_CREATE){
                        kind = FSMonitor.CREATE;
                    }
                    else {
                        kind = FSMonitor.REMOVE;
                    }
                    for(FSMonitor client: clients){
                        client.event(fName,kind);
                    }
                }
                kEy.reset();
            }

            watch.close();
        } catch (IOException | InterruptedException e) {
            //
        }

    }


}
