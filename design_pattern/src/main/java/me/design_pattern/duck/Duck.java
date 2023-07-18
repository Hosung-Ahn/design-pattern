package me.design_pattern.duck;

abstract class Duck {
    private final FlyBehavior flyBehavior;
    private final QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public FlyBehavior flyBehavior() {
        return flyBehavior;
    }

    public QuackBehavior quackBehavior() {
        return quackBehavior;
    }

    public void swim() {
        System.out.println("첨벙첨벙");
    }

    public void display() {
        System.out.println("난 오리야");
    }
}
