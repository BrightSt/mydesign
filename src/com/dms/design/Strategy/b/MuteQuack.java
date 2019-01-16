package com.dms.design.Strategy.b;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("不叫");
    }
}
