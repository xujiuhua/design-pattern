package com.structural.proxy;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Proxy implements IStar{

    /**
     * 真实的对象引用
     */
    private IStar star;

    public Proxy(IStar star) {
        this.star = star;
    }

    @Override
    public void sing() {
        System.out.println("前期准备");
        star.sing();
        System.out.println("后期工作");
    }
}
