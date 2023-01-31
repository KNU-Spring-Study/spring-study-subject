package com.spring.study.week1;

import com.spring.study.week1.repository.MapRepository;
import com.spring.study.week1.repository.Repository;
import com.spring.study.week1.service.NewService;
import com.spring.study.week1.service.Service;

public class AppConfig {

    public Service service() {
        return new Service(repository());
    }

    public NewService newService() {
        return new NewService(repository());
    }

    public Repository repository() {
        return new MapRepository();
    }
}
