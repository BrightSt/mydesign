package com.dms.design.Strategy.v3.behavior.impl;

import com.dms.design.Strategy.v3.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("用火箭飞");
    }
}
