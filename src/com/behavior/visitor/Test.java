package com.behavior.visitor;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {

        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");

        rootDir.add(binDir);

        binDir.add(new File("hello", 10));
        binDir.add(new File("world", 20));

        rootDir.accept(new ListVisitor());
    }
}
