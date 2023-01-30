package com.spring.study.week1.test;

import java.util.ArrayList;

public class List implements Structure{
    private final java.util.List<Object> store = new ArrayList<>();

    public void save(Object o) {
        store.add(o);
    }

    public Object findItem(int index) {
        System.out.println("im list");
        return store.get(index);
    }
}
