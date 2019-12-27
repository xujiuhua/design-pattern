package com.creator.factory.methodfactory;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class EnglishFoodFactory implements FoodFactory{

    @Override
    public Food makeFood(String name) {
        if ("A".equals(name)) {
            return new EnglishFoodA();
        } else if ("B".equals(name)) {
            return new EnglishFoodB();
        } else {
            return null;
        }
    }
}
