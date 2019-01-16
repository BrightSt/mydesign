package com.dms.design.Strategy.b;

public class RubberDuck extends Duck {
    public void quack() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("橡皮鸭");
    }

}
