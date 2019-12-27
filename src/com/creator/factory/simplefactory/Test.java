package com.creator.factory.simplefactory;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        Food noodle = FoodFactory.makeFood("noodle");
        Food rice = FoodFactory.makeFood("rice");
    }

}
