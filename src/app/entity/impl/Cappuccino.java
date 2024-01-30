package app.entity.impl;

import app.entity.Coffee;

public class Cappuccino implements Coffee {
    @Override
    public void prepare(){
        System.out.println("Your Cappuccino. Enjoy :)");
    }
}
