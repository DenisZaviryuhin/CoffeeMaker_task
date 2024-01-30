package app.entity.impl;

import app.entity.Coffee;

public class Latte implements Coffee {
    @Override
    public void prepare(){
        System.out.println("Your Latte. Enjoy :)");
    }
}
