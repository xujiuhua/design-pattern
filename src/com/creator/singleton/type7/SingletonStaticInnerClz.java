package com.creator.singleton.type7;

/**
 * <p>
 *
 *     静态内部类，只有当使用的时候才加载，保证了懒加载和线程安全（装载类）
 *
 *     推荐使用
 *
 * </p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class SingletonStaticInnerClz {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}

class Singleton {

    private Singleton() {}

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
