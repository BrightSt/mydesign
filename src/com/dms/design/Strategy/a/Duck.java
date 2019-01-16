package com.dms.design.Strategy.a;

public class Duck {
    public void quack(){
        System.out.println("呱呱叫");
    }

    public void swim(){
        System.out.println("游泳");
    }

    /**
     * 新增方法
     */
    public void fly(){
        System.out.println("我会飞");
    }
    public void display(){
      // 不实现，不同鸭子 外观不同
    }
}
