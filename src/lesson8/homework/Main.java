package lesson8.homework;

import java.util.HashMap;
import java.util.Map;

import static lesson8.homework.Base.*;

public class Main {
    public static void main(String[] args) {


        Vehicle v = new Vehicle(19.5, 60);

        System.out.println(v.getPetrolAmount());
        System.out.println(v.getTankVolume());
        System.out.println();

        System.out.println("Initially:");
        System.out.println( vehicles_ob_base );
        System.out.println( people_on_base );
        System.out.println( petrol_on_base );
        System.out.println( goods_on_base );
        System.out.println();

        v.arrive();
        System.out.println("Arrived");

        System.out.println( vehicles_ob_base );
        System.out.println( people_on_base );

        System.out.println( petrol_on_base );	// same
        System.out.println( goods_on_base );
        System.out.println();

        v.leave();
        System.out.println( "Left:" );

        System.out.println(vehicles_ob_base);	// left
        System.out.println(people_on_base);

        // should be 1000-(60-19.5)
        System.out.println(petrol_on_base);	// changed!

        System.out.println(goods_on_base);	// same
        System.out.println();

        HashMap<Integer, String> map = new HashMap();
        map.put(1,"Odin");
        map.put(2,"Dwa");
        map.put(3,"Tri");
        map.put(4,"Chetyre");

        for(Map.Entry<Integer, String> s: map.entrySet()){
            System.out.println(s.getValue());
            System.out.println(s.getKey());
        }
    }
}
