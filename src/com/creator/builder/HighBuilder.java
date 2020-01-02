package com.creator.builder;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class HighBuilder extends Builder {

    @Override
    public void setCpu() {
        this.computer.setCpu("i7");
    }

    @Override
    public void setMemory() {
        this.computer.setMemory("16G");
    }

    @Override
    public Computer build() {
        return this.computer;
    }
}
