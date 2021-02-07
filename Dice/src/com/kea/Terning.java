package com.kea;

import java.util.Random;

public class Terning {

    public void Random(){
        Random rand = new Random();
        int random_integer = rand.nextInt(6-1) +1;
        System.out.println("Du rullede " +random_integer);
    }
}
