package com.creator.singleton.type1;

/**
 * <p>
 *     饿汉式（静态常量）
 *
 *     Defect: 可能造成内存浪费
 *     Advantage: 简单、避免线程同步
 *
 *     可用
 *
 * </p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Singleton01 {

    // 1. 私有化构造器
    private Singleton01(){}

    // 2. 静态常量
    private final static Singleton01 instance = new Singleton01();

    // 3. 对外公共方法
    public static Singleton01 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton01 s1 = Singleton01.getInstance();
        Singleton01 s2 = Singleton01.getInstance();

        System.out.println(s1 == s2);
    }

}
