package com.spring.study.week1.controller;

import com.spring.study.week1.AppConfig;
import com.spring.study.week1.service.NewService;

public class NewController {

    AppConfig appConfig = new AppConfig();
    private final NewService newService = appConfig.newService();

    // ,,,
}
