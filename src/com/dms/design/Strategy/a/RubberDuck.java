package com.dms.design.Strategy.a;

public class RubberDuck extends Duck {
    @Override
    public void quack() {

    }

    @Override
    public void display() {
        System.out.println("橡皮鸭");
    }

    // 父类添加了fly 导致橡皮鸭也会飞，覆盖fly   如果有其他类型鸭子都要覆盖。

    @Override
    public void fly() {

    }
}
