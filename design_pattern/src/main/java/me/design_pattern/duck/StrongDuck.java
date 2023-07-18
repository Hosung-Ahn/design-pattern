package me.design_pattern.duck;

public class StrongDuck extends Duck{
    public StrongDuck() {

        super(new FlyHigh(), new QuackStrong());
    }
}
