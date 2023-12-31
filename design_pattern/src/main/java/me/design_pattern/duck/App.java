package me.design_pattern.duck;

public class App {
    public static void main(String[] args) {

        Duck strongDuck = new StrongDuck();
        strongDuck.performFly();
        strongDuck.performQuack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.performQuack();
        rubberDuck.setQuackBehavior(new QuackWing());
        rubberDuck.performQuack();

    }
}
