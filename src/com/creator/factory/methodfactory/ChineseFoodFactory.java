package com.creator.factory.methodfactory;


/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class ChineseFoodFactory implements FoodFactory{

    @Override
    public Food makeFood(String name) {
        if ("A".equals(name)) {
            Food chineseFoodA = new ChineseFoodA();
            chineseFoodA.prepare();
            return new ChineseFoodA();
        } else if ("B".equals(name)) {
            Food chineseFoodB = new ChineseFoodB();
            chineseFoodB.prepare();
            return chineseFoodB;
        } else {
            return null;
        }
    }
}


