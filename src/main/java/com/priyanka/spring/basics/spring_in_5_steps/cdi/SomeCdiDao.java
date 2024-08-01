package com.priyanka.spring.basics.spring_in_5_steps.cdi;

import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
public class SomeCdiDao {

    public int[] getData(){
        return new int[] {13,89,100};
    }
}
