package com.behavior.command;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Command command = new ConcreteCommand();

        Invoker invoker = new Invoker();
        invoker.appendCommand(command);
        invoker.appendCommand(command);

        invoker.call();
    }
}
