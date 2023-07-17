package me.design_pattern.duck;

public class FlyLow implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("파닥파닥");
    }
}
