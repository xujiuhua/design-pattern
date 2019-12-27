package com.creator.factory.abstractfactory;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class HardDisk {

    private String name;

    public HardDisk(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "name='" + name + '\'' +
                '}';
    }
}
