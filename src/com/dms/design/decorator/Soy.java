package com.dms.design.decorator;

/**
 * 功能描述：
 * 修改记录:
 * <pre>
 * 修改时间：
 * 修改人：
 * 修改内容：
 * </pre>
 *
 * @title Soy
 * @Author: dongms
 * @Date: 2024/5/29
 */
public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy (Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost () {
        return .98+ beverage.cost();
    }

    @Override
    public String getDescription () {
        return beverage.getDescription()+",soy";
    }
}
