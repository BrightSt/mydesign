package com.dms.design.factory;

/**
 * 功能描述：
 * 修改记录:
 * <pre>
 * 修改时间：
 * 修改人：
 * 修改内容：
 * </pre>
 *
 * @title PizzaTestDrive
 * @Author: dongms
 * @Date: 2024/6/16
 */
public class PizzaTestDrive {

    public static void main (String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());


        System.out.println("-----------------------------------------");

        Pizza pizza1 = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza1.getName());
    }
}
