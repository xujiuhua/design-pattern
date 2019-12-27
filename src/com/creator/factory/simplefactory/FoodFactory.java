package com.creator.factory.simplefactory;


/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class FoodFactory {

    public static Food makeFood(String name) {
        if ("noodle".equals(name)) {
            Food noodle = new Noodle();
            noodle.prepare();
            return noodle;
        } else if ("rice".equals(name)) {
            Food rice = new Rice();
            rice.prepare();
            return rice;
        } else {
            return null;
        }
    }

}
