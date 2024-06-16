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
 * @title NYStyleVeggiePizza
 * @Author: dongms
 * @Date: 2024/6/16
 */
public class NYStyleVeggiePizza extends Pizza{
    public NYStyleVeggiePizza()
    {
        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

    public void prepare()
    {
        System.out.println("Preparing " + name);
    }

}
