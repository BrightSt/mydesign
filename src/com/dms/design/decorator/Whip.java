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
 * @title Whip
 * @Author: dongms
 * @Date: 2024/5/29
 */
public class Whip extends CondimentDecorator{

    Beverage beverage;

    public Whip (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost () {
        return .88+ beverage.cost();
    }

    @Override
    public String getDescription () {
        return beverage.getDescription()+",whip";
    }
}
