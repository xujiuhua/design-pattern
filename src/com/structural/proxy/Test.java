package com.structural.proxy;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        RealStar star = new RealStar();
        Proxy proxy = new Proxy(star);
        proxy.sing();
    }
}
