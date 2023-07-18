package me.design_pattern.duck;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyLow(), new QuackRubber());
    }

    @Override
    public void swim() {
        System.out.println("난 수열을 못해");
    }

    @Override
    public void display() {
        System.out.println("난 고무 오리라고 해");
    }
}
