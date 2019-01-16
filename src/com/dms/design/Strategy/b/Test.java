package com.dms.design.Strategy.b;

public class Test {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck(new FlyNoWay(),new Quack());
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }
}
