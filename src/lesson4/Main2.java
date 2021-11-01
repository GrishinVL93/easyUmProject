package lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        String email = "grishinVl93@gmail.com";

        String[] emailParts = email.split("@");


        if(emailParts.length !=2){
            System.out.println("Email введен некорректно(@)");
            return;
        }

        if(email.endsWith(".") || email.startsWith(".")){

        }
        System.out.println(Arrays.toString(emailParts));
    }
}
