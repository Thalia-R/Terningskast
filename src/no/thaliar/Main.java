package no.thaliar;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Dice regular6Dice = new Regular6Dice();
        System.out.println("regular6Dice.Roll() = " + regular6Dice.roll());
        System.out.println("regular6Dice.Roll() = " + regular6Dice.roll());
        System.out.println("regular6Dice.Roll() = " + regular6Dice.roll());

        Dice cheat8Dice = new Cheat8Dice();
        System.out.println("Cheat8Dice.Roll() = " + cheat8Dice.roll());


        List<Dice> numbers = new ArrayList<>(10000);


    }
}
