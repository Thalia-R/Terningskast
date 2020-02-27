package no.thaliar;

import java.util.Random;

public abstract class Dice {
    private final int numberOfSides;

     Dice(int numberOfSides) {
         this.numberOfSides = numberOfSides;
         if (numberOfSides < 1)
             numberOfSides = 1;
         if (numberOfSides > 20)
             numberOfSides = 20;
     }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    abstract int roll();
}
