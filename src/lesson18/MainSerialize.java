package lesson18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainSerialize {
    public static void main(String[] args) {
        try {
            ObjectOutputStream ois = new ObjectOutputStream(
                    new FileOutputStream("state.bin"));
            ois.writeObject("text");
            ois.writeDouble(2.0);
            ois.writeObject(new Point(2,3));

            ois.flush();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
