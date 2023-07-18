package me.design_pattern.duck;

public class App {
    public static void main(String[] args) {

        StrongDuck strongDuck = new StrongDuck();
        strongDuck.flyBehavior().fly();
        strongDuck.quackBehavior().quack();
    }
}
