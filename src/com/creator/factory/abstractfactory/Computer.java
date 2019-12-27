package com.creator.factory.abstractfactory;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Computer {

    private Cpu cpu;

    private HardDisk hardDisk;

    public Computer(Cpu cpu, HardDisk hardDisk) {
        this.cpu = cpu;
        this.hardDisk = hardDisk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", hardDisk=" + hardDisk +
                '}';
    }
}
