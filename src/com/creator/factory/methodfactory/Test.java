package com.creator.factory.methodfactory;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        // 选择一个具体的工厂
        FoodFactory foodFactory = new ChineseFoodFactory();
        // 由选择的工厂来生产食物
        foodFactory.makeFood("A");
    }
}
