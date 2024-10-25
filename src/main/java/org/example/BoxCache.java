package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BoxCache<K,V extends BoxOperations> {
    HashMap<K, V> hashMap = new HashMap<>();
    public void put(int i, Box<String, Float> box) {
    }

    public List<V> getAll() {
        return new ArrayList<>(hashMap.values());
    }
}
