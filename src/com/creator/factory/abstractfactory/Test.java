package com.creator.factory.abstractfactory;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        // 选择一个工厂，避免生产的cpu和hardDisk不兼容；产品组
        ComputerFactory computerFactory = new MacComputerFactory();
        Computer computer = computerFactory.create();
        System.out.println(computer);
    }
}
