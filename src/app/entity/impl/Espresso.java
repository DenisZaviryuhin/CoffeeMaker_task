package app.entity.impl;

import app.entity.Coffee;

public class Espresso implements Coffee {
    @Override
    public void prepare(){
        System.out.println("Your Espresso. Enjoy :)");
    }
}
