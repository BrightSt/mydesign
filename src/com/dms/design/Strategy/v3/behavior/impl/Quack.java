package com.dms.design.Strategy.v3.behavior.impl;

import com.dms.design.Strategy.v3.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
