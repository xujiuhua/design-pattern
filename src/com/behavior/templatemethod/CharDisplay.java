package com.behavior.templatemethod;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class CharDisplay extends Display{

    private char c;

    public CharDisplay(char c) {
        this.c = c;
    }

    @Override
    public void open() {
        System.out.print("<<<");
    }

    @Override
    public void print() {
        System.out.print(c);
    }

    @Override
    public void close() {
        System.out.println(">>>");
    }
}
