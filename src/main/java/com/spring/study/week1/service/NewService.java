package com.spring.study.week1.service;

import com.spring.study.week1.repository.Repository;

public class NewService {

    private final Repository repository;

    public NewService(Repository repository) {
        this.repository = repository;
    }

    public void logic() {
        return;
    }
}
