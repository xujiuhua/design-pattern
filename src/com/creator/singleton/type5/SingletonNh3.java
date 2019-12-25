package com.creator.singleton.type5;

/**
 * <p>
 *
 *     线程安全都无法保证，不能使用
 *
 * </p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class SingletonNh3 {

    public static void main(String[] args) {

    }

}

class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance() {

        if (instance == null) {

            synchronized (Singleton.class) {
                instance = new Singleton();
            }

        }
        return instance;
    }

}
