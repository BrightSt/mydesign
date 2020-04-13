package com.dms.design.singleton;

/**
 * 单例模式客户端测试
 * @author dongms
 * @version V1.0
 * @Package com.dms.design.singleton
 * @description 说明：
 * @date 2020/4/11 17:13
 */
public class Client {

    public static void main (String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass.method_a());

    }

}
