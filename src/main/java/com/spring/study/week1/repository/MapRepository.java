package com.spring.study.week1.repository;

import java.util.HashMap;
import java.util.Map;

public class MapRepository implements Repository {

    private final Map<Integer, Object> store = new HashMap<>();
    private int sequence = 0;

    @Override
    public void save(Object o) {
        store.put(sequence++, o);
    }

    @Override
    public Object findItem(int index) {
        return store.get(index);
    }
}
