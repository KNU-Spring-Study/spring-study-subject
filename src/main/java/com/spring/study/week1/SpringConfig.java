package com.spring.study.week1;

import com.spring.study.week1.repository.MapRepository;
import com.spring.study.week1.repository.Repository;

public class SpringConfig {

    public Repository repository () {
        return new MapRepository();
    }
}
