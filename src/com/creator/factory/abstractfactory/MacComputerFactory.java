package com.creator.factory.abstractfactory;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class MacComputerFactory implements ComputerFactory{
    @Override
    public Cpu crateCpu() {
        return new Cpu("Mac");
    }

    @Override
    public HardDisk createHardDisk() {
        return new HardDisk("Mac");
    }

    @Override
    public Computer create() {
        return new Computer(this.crateCpu(), this.createHardDisk());
    }

}
