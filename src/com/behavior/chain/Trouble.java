package com.behavior.chain;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Trouble {

    private int num;

    public Trouble(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Trouble{" +
                "num=" + num +
                '}';
    }
}

