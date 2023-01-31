package com.spring.study.week1.repository;

public interface Repository {

    void save(Object o);

    Object findItem(int index);
}
