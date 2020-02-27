package no.thaliar;

import java.util.Random;

public class Cheat8Dice extends Dice {

    Cheat8Dice() {
        super(8);
    }

    @Override
    int roll() {

        int random = (int) (Math.random()*(5-1+1) + 1);  // 1 er 20% av 5, derfor blir 1 printet med 20% sannsynlighet, resterende(80%) blir da 8
        if (random == 1){
            return 1;
        } else
            return 8;
    }


    /* kan også skrives :
    double randomValue =  math.random();
    if (randomValue < 0.2){
        return 1;
    }
    return getNumberOfSides(); // eller 8*/
}

