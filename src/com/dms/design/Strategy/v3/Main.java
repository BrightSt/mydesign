package com.dms.design.Strategy.v3;

import com.dms.design.Strategy.v3.behavior.impl.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
       Duck mallard = new MallardDuck();
       mallard.performQuack();
       mallard.performFly();


       Duck model = new ModelDuck();
       model.performFly();
       // 可以动态改变行为
       model.setFlyBehavior(new FlyRocketPowered());
       model.performFly();
    }
}
