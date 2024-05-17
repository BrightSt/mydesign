package com.dms.design.Strategy.v2;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------绿头鸭-----------------------------");
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.display();
        mallardDuck.fly();

        System.out.println("---------------------红头鸭-----------------------------");
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.quack();
        redheadDuck.swim();
        redheadDuck.display();
        redheadDuck.fly();

        System.out.println("---------------------橡皮鸭-----------------------------");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.display();
        rubberDuck.fly();

        System.out.println("---------------------诱饵鸭-----------------------------");
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.quack();
        decoyDuck.swim();
        decoyDuck.display();
        decoyDuck.fly();
    }
}
