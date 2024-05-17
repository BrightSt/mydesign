package com.dms.design.Strategy.v1;

/**
 * 功能描述：
 * 修改记录:
 * <pre>
 * 修改时间：
 * 修改人：
 * 修改内容：
 * </pre>
 *
 * @title RubberDuck
 * @Author: dongms
 * @Date: 2024/5/17
 */
public class RubberDuck extends Duck{
    /**
     * 因为橡皮鸭不是呱呱叫，所以重写quack方法
     */
    @Override
    public void quack () {
        System.out.println("吱吱叫");
    }

    @Override
    public void display () {
        System.out.println("橡皮鸭");
    }
}
