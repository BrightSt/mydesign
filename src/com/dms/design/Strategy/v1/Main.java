package com.dms.design.Strategy.v1;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------绿头鸭-----------------");
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.display();

        System.out.println("-----------红头鸭-----------------");
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.quack();
        redheadDuck.swim();
        redheadDuck.display();

        System.out.println("-----------橡皮鸭-----------------");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.display();
    }
}
