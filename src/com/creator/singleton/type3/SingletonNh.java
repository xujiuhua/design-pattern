package com.creator.singleton.type3;

/**
 * <p>
 *
 *     懒汉式（线程不安全）
 *
 *     Advantage：懒加载效果
 *     Defect：线程不安全
 *
 *     ×实际开发中不能使用×
 * </p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class SingletonNh {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }

}


class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}