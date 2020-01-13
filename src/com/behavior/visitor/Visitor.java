package com.behavior.visitor;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class Visitor {

    abstract void visit(File file);

    abstract void visit(Directory directory);
}
