package com.uml.aggregation;

/**
 * <p>
 *     电脑和鼠标可以分离
 *     电脑和显示器可以分离
 * </p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Computer {

    private Mouse mouse;

    private Monitor monitor;

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}

