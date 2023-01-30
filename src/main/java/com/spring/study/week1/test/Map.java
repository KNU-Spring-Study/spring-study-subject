package com.spring.study.week1.test;

import java.util.HashMap;

public class Map implements Structure{
    private final java.util.Map<Integer, Object> store = new HashMap<>();
    private int sequence = 0;

    public void save(Object o) {
        store.put(sequence++, o);
    }

    public Object findItem(int index) {
        System.out.println("im map");
        return store.get(index);
    }
}
