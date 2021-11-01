package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,Double> nameAndMany = new HashMap<>();

        nameAndMany.put("Джон Доу", 3443.5);
        nameAndMany.put("Toм Смит", 123.22);
        nameAndMany.put("Джейн Бейкер", 1378.00);
        nameAndMany.put("Тод Холл", 99.22);
        nameAndMany.put("Ральф Смит", -19.98);

        System.out.println(nameAndMany);


    }
}
