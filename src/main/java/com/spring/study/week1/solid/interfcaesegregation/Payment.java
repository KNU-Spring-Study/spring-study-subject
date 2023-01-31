package com.spring.study.week1.solid.interfcaesegregation;

import java.util.List;

public interface Payment {

    Object status();

    List<Object> getPayments();
}
