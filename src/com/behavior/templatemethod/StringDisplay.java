package com.behavior.templatemethod;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class StringDisplay extends Display {

    private String s;
    private int with;

    public StringDisplay(String s) {
        this.s = s;
        this.with = s.getBytes().length;
    }

    @Override
    protected void open() {
        printLine();
    }

    @Override
    protected void print() {
        System.out.println("|" + s + "|");
    }

    @Override
    protected void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < with; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
