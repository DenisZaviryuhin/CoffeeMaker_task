package app.controller;

import app.entity.CoffeeMaker;
import app.entity.impl.Cappuccino;
import app.entity.impl.Espresso;
import app.entity.impl.Latte;

import java.util.Scanner;

public class AppController {
    public static int getOption() {
        System.out.println("Choose a drink:\n" +
                "      1 - Espresso\n" +
                "      2 - Cappuccino\n" +
                "      3 - Latte");
        return new Scanner(System.in).nextInt();
    }

    public static void runOption(int option) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        switch (option) {
            case 1 -> {
                coffeeMaker.setCoffeeType(new Espresso());
                coffeeMaker.startPrepare();
            }

            case 2 -> {
                coffeeMaker.setCoffeeType(new Cappuccino());
                coffeeMaker.startPrepare();

            }
            case 3 -> {
                coffeeMaker.setCoffeeType(new Latte());
                coffeeMaker.startPrepare();
            }
            default -> System.out.println("No such option.");
        }

    }
}
