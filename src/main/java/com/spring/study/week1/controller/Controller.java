package com.spring.study.week1.controller;

import com.spring.study.week1.AppConfig;
import com.spring.study.week1.service.Service;

public class Controller {

    AppConfig appConfig = new AppConfig(); // 의존관계를 주입해 주는 친구
    private final Service service = appConfig.service(); // 의존관계 주입

    void addObject(Object o) {
        Object savedObject = service.saveAndFind(o);
        System.out.println("savedObject = " + savedObject);
    }
}
