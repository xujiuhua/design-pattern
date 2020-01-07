package com.behavior.templatemethod;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class Display {

    protected abstract void open();

    protected abstract void print();

    protected abstract void close();

    protected final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
