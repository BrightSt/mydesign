package com.dms.design.singleton;

/**
 * 1.构造方法私有化
 * 2.单例类内部创建对象（懒汉模式、恶汉模式  创建对象的时机不同）
 * @author dongms
 * @version V1.0
 * @Package com.dms.design.singleton
 * @description 说明：
 * @date 2020/4/11 17:11
 */
public class SingletonClass {

    /**
     * 先创建实例
     */
    private static SingletonClass singletonClass = new SingletonClass();

    /**
     * 构造方法私有化
     */
    private SingletonClass () {
    }

    /**
     * 获取实例
     * @return
     */
    public static SingletonClass getInstance(){
        return singletonClass;
    }

    /**
     * 方法提供
     * @return
     */
    public String method_a(){
        return "method_a";
    }


}
