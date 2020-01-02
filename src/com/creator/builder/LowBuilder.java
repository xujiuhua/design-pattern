package com.creator.builder;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class LowBuilder extends Builder {

    @Override
    public void setCpu() {
        this.computer.setCpu("i5");
    }

    @Override
    public void setMemory() {
        this.computer.setMemory("8G");
    }

    @Override
    public Computer build() {
        return this.computer;
    }
}
