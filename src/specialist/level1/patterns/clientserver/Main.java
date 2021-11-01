package specialist.level1.patterns.clientserver;

public class Main {

    public static void main(String[] args) {
        FSServer server = new FSServer(".");
        server.addClients(new FSMonitor() {
            @Override
            public void event(String fname, int kind) {
                switch (kind){
                    case FSMonitor.CREATE:
                        System.out.println("File created " + fname);
                        break;
                    case FSMonitor.REMOVE:
                        System.out.println("File removed " + fname);
                        break;
                    default:
                        System.out.println("Unknown method");

                }
            }
        });
        server.start();
    }

}
