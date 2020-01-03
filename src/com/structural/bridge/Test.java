package com.structural.bridge;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {

        Display d1 = new Display(new StringDisplayImpl("hello world"));
        Display d2 = new CountDisplay(new StringDisplayImpl("hello China"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello friend"));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay();

    }
}
