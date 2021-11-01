package lesson14;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleCache<K,V> extends LinkedHashMap {
    private final int CAPACITY;

    public SimpleCache(int capacity) {
        super(capacity + 1,1.1f,true);
        this.CAPACITY = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return this.size() > CAPACITY;
    }
}
