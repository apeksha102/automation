package com.mavenit.ui.utils;

import org.junit.Test;

import java.util.Random;

public class Helpers {
    @Test
    public int randomNumber(int boundnumber){
        Random random = new Random();
        int randomNumber= random.nextInt(boundnumber-1);
        System.out.println("The Random Number is "+randomNumber);


        return randomNumber;
    }



}




