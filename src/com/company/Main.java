package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);

        System.out.println(randomNum);

        if ( randomNum > 5){
            System.out.println("The number is greater than 5.");
        } else {
            System.out.println("The number is less than 5.");
        }
    }
}
