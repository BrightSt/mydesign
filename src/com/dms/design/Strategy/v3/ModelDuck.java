package com.dms.design.Strategy.v3;

import com.dms.design.Strategy.v3.behavior.impl.FlyNoWay;
import com.dms.design.Strategy.v3.behavior.impl.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是模型鸭");
    }
}
