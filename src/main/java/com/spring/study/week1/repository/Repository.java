package com.spring.study.week1.repository;

public interface Repository {

    public void save(Object o);

    public Object findItem(int index);
}
