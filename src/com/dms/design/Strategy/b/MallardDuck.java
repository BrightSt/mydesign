package com.dms.design.Strategy.b;

public class MallardDuck extends Duck {

    public MallardDuck(FlyBehavior flyBehavior,QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        System.out.println("我是绿头鸭");
    }
}
