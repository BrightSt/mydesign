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
 * @title DarkRoast
 * @Author: dongms
 * @Date: 2024/5/29
 */
public class DarkRoast extends Beverage{

    public DarkRoast () {
        description = "DarkRoast";
    }

    @Override
    public double cost () {
        return 1;
    }
}
