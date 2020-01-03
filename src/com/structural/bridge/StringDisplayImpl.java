package com.structural.bridge;

/**
 * <p>
 *
 *     类的实现层次结构的具体实现：
 *
 * </p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class StringDisplayImpl extends DisplayImpl {

    private int width;
    private String s;

    public StringDisplayImpl(String s) {
        this.s = s;
        this.width = s.getBytes().length;
    }

    @Override
    void rawOpen() {
        printLine();
    }

    @Override
    void rawPrint() {
        System.out.println("|" + this.s + "|");
    }

    @Override
    void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
