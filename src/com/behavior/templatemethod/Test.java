package com.behavior.templatemethod;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {

        Display d1 = new CharDisplay('x');
        d1.display();

        Display d2 = new StringDisplay("hello");
        d2.display();
    }
}
