package me.design_pattern.decoratorPattern;

public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
