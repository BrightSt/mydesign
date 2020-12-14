package com.dms.design.Strategy.v2;

public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("我是橡皮鸭");
    }

    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }

    @Override
    public void fly() {

    }
}
