package no.thaliar;

public class Regular6Dice extends Dice{

    Regular6Dice() {
        super(6);
    }

    @Override
    int roll() {
        int min = 1;
        int max = 6;
        int random = (int) (Math.random()*(max-min+1) + min);
        return random;
    }
}
