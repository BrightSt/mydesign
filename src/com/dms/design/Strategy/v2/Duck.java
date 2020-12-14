package com.dms.design.Strategy.v2;

/**
 * 超类
 */
public abstract class Duck {

    /**
     * 叫
     */
    public void quack(){
        System.out.println("呱呱叫");
    }

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

    /**
     * 飞
     */
    public void fly(){
        System.out.println("会飞");
    }

}
