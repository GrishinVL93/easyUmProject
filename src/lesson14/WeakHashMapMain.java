package lesson14;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapMain {
    public static void main(String[] args) {
        Map<Date,String> weakMap = new WeakHashMap<>();
        Date date = new Date();

        weakMap.put(date,"information");

        date = null;

        System.gc();

        for(int i = 0; i < 10000;i++){
            if(weakMap.isEmpty()){
                System.out.println("Empty! " + i);
                break;
            }
        }
    }
}
