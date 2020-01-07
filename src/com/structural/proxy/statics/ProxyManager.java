package com.structural.proxy.statics;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class ProxyManager implements IStar{

    /**
     * 真实的对象引用
     */
    private IStar star;

    public ProxyManager() {
    }

    @Override
    public void sing() {
        if (star == null) {
            star = new RealStar();
        }

        System.out.println("前期准备");
        star.sing();
        System.out.println("后期工作");
    }
}
