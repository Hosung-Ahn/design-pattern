package me.design_pattern.duck;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyLow(), new QuackRubber());
    }
}
