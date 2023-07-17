package me.design_pattern.duck;

public class FlyHigh implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("슈우우웅");
    }
}
