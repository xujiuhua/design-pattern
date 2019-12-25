package com.uml.composition;

/**
 * <p>
 *     电脑和鼠标、显示器不能分离
 * </p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Computer {

    private Mouse mouse = new Mouse();
    private Monitor monitor = new Monitor();

}

