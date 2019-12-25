package com.creator.singleton.type4;

/**
 * <p>
 *     懒汉式（线程安全）
 *
 *     Defect：效率太低，每次都同步
 *
 *     可用，但是不推荐使用
 *
 * </p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class SingletonNh2 {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }


}

class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}