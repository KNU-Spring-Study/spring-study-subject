package com.spring.study.week1;

import java.util.HashMap;
import java.util.Map;

public class MapRepository implements RepositoryInterface {

    private final Map<Integer, Object> store = new HashMap<>();
    private int sequence = 0;

    public void save(Object o) {
        store.put(sequence++, o);
    }

    public Object findItem(int index) {
        return store.get(index);
    }
}
