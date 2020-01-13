package com.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Invoker {

    private List<Command> commandList = new ArrayList<>();

    public void appendCommand(Command command) {
        commandList.add(command);
    }

    public void call() {
        commandList.forEach(Command::execute);
    }

}
