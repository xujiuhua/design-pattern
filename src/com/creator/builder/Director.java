package com.creator.builder;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer createComputer() {
        builder.setCpu();
        builder.setMemory();
        return builder.build();
    }
}
