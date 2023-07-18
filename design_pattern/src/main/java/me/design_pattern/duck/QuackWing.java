package me.design_pattern.duck;

public class QuackWing implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("위잉위잉");
    }
}
