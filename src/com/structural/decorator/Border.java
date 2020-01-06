package com.structural.decorator;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class Border extends Display {

    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
