package com.creator.factory.simplefactory;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Noodle extends Food{
    @Override
    void prepare() {
        System.out.println("准备 Noodle!");
    }
}
