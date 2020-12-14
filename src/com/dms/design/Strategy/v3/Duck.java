package com.dms.design.Strategy.v3;

import com.dms.design.Strategy.v3.behavior.FlyBehavior;
import com.dms.design.Strategy.v3.behavior.QuackBehavior;

/**
 * 超类
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    /**
     * 游泳
     */
    public void swim(){
        System.out.println("会游泳");
    }

    /**
     * 外观
     */
    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

}
