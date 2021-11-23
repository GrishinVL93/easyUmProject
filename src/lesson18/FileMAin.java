package lesson18;

import java.io.File;
import java.io.FileFilter;
import java.io.FilterInputStream;

public class FileMAin {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Vlad\\Downloads");

        File[] filesFromDownload = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory()) return true;
                if(pathname.getName().endsWith(".png") ||
                        pathname.getName().endsWith(".jpg")
                || pathname.getName().endsWith(".svg"))
                    return true;

                return false;
            }
        });

        for(File f: filesFromDownload){
            System.out.println(f.getAbsoluteFile());
        }
    }
}
