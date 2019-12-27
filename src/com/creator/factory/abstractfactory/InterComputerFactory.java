package com.creator.factory.abstractfactory;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class InterComputerFactory implements ComputerFactory{
    @Override
    public Cpu crateCpu() {
        return new Cpu("Inter");
    }

    @Override
    public HardDisk createHardDisk() {
        return new HardDisk("inter");
    }

    @Override
    public Computer create() {
        return new Computer(this.crateCpu(), this.createHardDisk());
    }
}
