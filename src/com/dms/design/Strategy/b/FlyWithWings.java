package com.dms.design.Strategy.b;

public class FlyWithWings implements  FlyBehavior{
    @Override
    public void fly() {
        System.out.println("用翅膀飞");
    }
}
