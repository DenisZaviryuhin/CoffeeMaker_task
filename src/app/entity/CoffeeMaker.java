package app.entity;

import app.entity.Coffee;

public class CoffeeMaker {
    private Coffee coffee;

    public void setCoffeeType(Coffee coffee) {
        this.coffee = coffee;

    }

    public void startPrepare() {
        coffee.prepare();
    }
}
