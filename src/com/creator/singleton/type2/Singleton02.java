package com.creator.singleton.type2;

import com.creator.singleton.type1.Singleton01;

/**
 * <p>
 *
 *     饿汉式（静态代码块）
 *
 *     与01优缺点一样，只是写法不同
 *
 * </p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Singleton02 {

    private Singleton02() {

    }

    private final static Singleton02 instance;

    static {
        instance = new Singleton02();
    }

    public static Singleton02 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton01 s1 = Singleton01.getInstance();
        Singleton01 s2 = Singleton01.getInstance();

        System.out.println(s1 == s2);
    }
}
