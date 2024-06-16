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
 * @title NYPizzaStore
 * @Author: dongms
 * @Date: 2024/6/16
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza (String type) {
       if ( type.equals("cheese") ){
           return new NYStyleCheesePizza();
       }else if ( type.equals("veggie") ){
           return new NYStyleVeggiePizza();
       }else return null;
    }
}
