package com.structural.adapter.classadapter;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Banner {

    private String s;

    public Banner(String s) {
        this.s = s;
    }

    public void showWithParen() {
        System.out.println("(" + s + ")");
    }
}
