package specialist.level1.lesson4.files;

import java.io.*;

public class Main1 {
    public static void main(String[] args) {

        writeHelloToFile("hello.txt");

        try {
            String str = readFromFile("string.txt");
            System.out.println(str);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static String readFromFile(String stringtxt) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(stringtxt),"utf-8"));
        String str = reader.readLine();
        return str;
    }


    private static void writeHelloToFile(String file)  {
        /*
        * reader\writer
        * stream(бинарные файлы)*/



        try(FileWriter writer = new FileWriter(file)){
            writer.write("Привет");
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}
