package lesson14;

import java.util.Map;

public class CacheMain {
    public static void main(String[] args) {
        Map<Integer,String> cache = new SimpleCache<>(2);

        cache.put(1,"a");
        cache.put(2,"b");
        cache.put(3,"c");
        System.out.println("Стартовый кэш: " +cache);
        cache.get(2);
        System.out.println("Кэш после вызова get: " + cache);
        cache.put(9,"i");

        System.out.println("Кэш после испоьльзования: " + cache);
    }
}
