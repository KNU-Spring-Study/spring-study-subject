package com.spring.study.week1.solid.interfcaesegregation;

import java.util.List;

public class BankPayment implements Bank {

    @Override
    public void initiatePayments() {
    }

    @Override
    public Object status() {
        return null;
    }

    @Override
    public List<Object> getPayments() {
        return null;
    }
}
