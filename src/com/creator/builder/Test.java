package com.creator.builder;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {

        Director director = new Director(new LowBuilder());
        Computer computer = director.createComputer();
        System.out.println(computer);

        director = new Director(new HighBuilder());
        Computer computer1 = director.createComputer();
        System.out.println(computer1);

    }
}
