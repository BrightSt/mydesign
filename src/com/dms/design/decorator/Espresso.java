package com.dms.design.decorator;

/**
 * 功能描述： 浓咖啡
 * 修改记录:
 * <pre>
 * 修改时间：
 * 修改人：
 * 修改内容：
 * </pre>
 *
 * @title Espresso
 * @Author: dongms
 * @Date: 2024/5/29
 */
public class Espresso extends Beverage{

    public Espresso () {
        description = "Espresso";
    }
    @Override
    public double cost () {
        return 1.99;
    }
}
