package com.behavior.visitor;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public interface Element {
    void accept(Visitor visitor);
}
