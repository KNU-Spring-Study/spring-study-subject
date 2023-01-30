package com.spring.study.week1.test;

public class main {

    public static void main(String args[]){
        final Structure repository = new List();
        repository.save("test");
        System.out.println("find item : "+repository.findItem(0));

    }

}
