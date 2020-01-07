package com.structural.proxy.statics;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class RealStar implements IStar{
    @Override
    public void sing() {
        System.out.println("唱歌");
    }
}
