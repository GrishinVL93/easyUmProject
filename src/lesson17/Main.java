package lesson17;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /*long startTime = System.currentTimeMillis();
        CopyWithByte oneByte = new CopyWithByte();
        oneByte.copy("ideasetup.exe","filegarbage.exe");

        long endTime = System.currentTimeMillis();
        System.out.println("one byte method copy time: " + (endTime - startTime));

*/
        long startTime1 = System.currentTimeMillis();
        CopyWithFiles copyWithFiles = new CopyWithFiles();
        copyWithFiles.copy("ideasetup.exe","filegarbage2.exe");
        long endTime1 = System.currentTimeMillis();

        System.out.println("fies method copy time " + (endTime1 - startTime1));


        long startTime2 = System.currentTimeMillis();
        CopyWithGuava copyWithGuava = new CopyWithGuava();
        copyWithGuava.copy("ideasetup.exe","filegarbage3.exe");
        long endTime2 = System.currentTimeMillis();

        System.out.println("guava method copy time " + (endTime2 - startTime2));
    }
}
