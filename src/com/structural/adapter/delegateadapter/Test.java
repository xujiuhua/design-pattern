package com.structural.adapter.delegateadapter;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Print print = new PrintBanner("hello");
        print.printWeak();
    }
}
