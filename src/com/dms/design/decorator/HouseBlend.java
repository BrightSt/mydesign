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
 * @title HouseBlend
 * @Author: dongms
 * @Date: 2024/5/29
 */
public class HouseBlend extends Beverage{

    public HouseBlend () {
        description = "House Blend Coffee";
    }
    @Override
    public double cost () {
        return .89;
    }
}
