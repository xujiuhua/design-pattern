package com.creator.factory.methodfactory;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class ChineseFoodA extends Food {
    @Override
    void prepare() {
        System.out.println("准备 中国 食物A");
    }
}