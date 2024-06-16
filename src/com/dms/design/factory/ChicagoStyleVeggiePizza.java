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
 * @title ChicagoStyleVeggiePizza
 * @Author: dongms
 * @Date: 2024/6/16
 */
public class ChicagoStyleVeggiePizza extends Pizza{
    public ChicagoStyleVeggiePizza()
    {
        name = "Chicago Style Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

}
