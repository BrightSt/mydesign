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
 * @title Mocha
 * @Author: dongms
 * @Date: 2024/5/29
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha (Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost () {
        return .20+beverage.cost();
    }

    @Override
    public String getDescription () {
        return beverage.getDescription()+",Mocha";
    }
}
