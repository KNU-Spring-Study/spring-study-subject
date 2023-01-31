package com.spring.study.week1.solid.interfcaesegregation;

public interface Loan extends Payment {

    void initiateLoanSettlement();

    void initiateRePayment();
}
