package com.dms.design.Strategy.v3;

import com.dms.design.Strategy.v3.behavior.impl.FlyWithWings;
import com.dms.design.Strategy.v3.behavior.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是绿头鸭");
    }
}
