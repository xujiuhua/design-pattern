package com.structural.composite;

import com.creator.builder.Director;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");

        root.add(bin);
        bin.add(new File("readme.md", 100));
        bin.add(new File("readme.txt", 99));

        root.printList();
    }
}
