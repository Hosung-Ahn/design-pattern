package me.design_pattern.duck;

public class App {
    public static void main(String[] args) {

        Duck strongDuck = new Duck(new FlyHigh(), new QuackStrong());
        strongDuck.flyBehavior().fly();
        strongDuck.quackBehavior().quack();
        
    }
}
