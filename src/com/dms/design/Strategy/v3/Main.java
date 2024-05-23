package com.dms.design.Strategy.v3;

import com.dms.design.Strategy.v3.behavior.impl.FlyRocketPowered;

public class Main {
    public static void main (String[] args) {

        System.out.println("-----------------绿头鸭------------------");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("-----------------模型鸭------------------");
        Duck model = new ModelDuck();
        model.performFly();
        // 可以动态改变行为
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
