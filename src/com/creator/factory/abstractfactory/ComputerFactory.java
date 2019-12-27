package com.creator.factory.abstractfactory;


/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public interface ComputerFactory {

    Cpu crateCpu();

    HardDisk createHardDisk();

    Computer create();
}
