package com.structural.decorator;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("hello world");
        Display b2 = new SideBorder(b1, '*');
        Display b3 = new FullBorder(b2);

        b1.show();
        b2.show();
        b3.show();

    }
}
