package com.structural.proxy.dynamic;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Hello implements IHello{
    @Override
    public void sayHello() {
        System.out.println("say hello.");
    }
}
