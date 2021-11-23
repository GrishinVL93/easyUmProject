package lesson18;

import java.io.*;

public class MainDeserialize {
    public static void main(String[] args) {
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("state.bin"));
            String st = (String)ois.readObject();
            double number = ois.readDouble();
            Point point = (Point) ois.readObject();

            System.out.println(st + " " + number + " " + point);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
