package me.design_pattern.duck;

public class QuackRubber implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑삑");
    }
}
