package com.spring.study.week1.repository;

import java.util.ArrayList;
import java.util.List;

public class ListRepository implements Repository {

    private final List<Object> store = new ArrayList<>();

    public void save(Object o) {
        store.add(o);
    }

    public Object findItem(int index) {
        return store.get(index);
    }
}
