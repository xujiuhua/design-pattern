package com.creator.builder;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class Builder {

    protected Computer computer = new Computer();

    abstract void setCpu();

    abstract void setMemory();

    abstract Computer build();
}
