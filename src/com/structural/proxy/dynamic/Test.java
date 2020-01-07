package com.structural.proxy.dynamic;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取动态代理类
        Class<?> proxyClazz = Proxy.getProxyClass(IHello.class.getClassLoader(), IHello.class);
        // 获取代理类的构造函数
        Constructor<?> constructor = proxyClazz.getConstructor(InvocationHandler.class);
        // 通过构建函数来创建动态代理对象
        IHello hello = (IHello) constructor.newInstance(new MyInvocationHandler(new Hello()));
        hello.sayHello();
    }
}
