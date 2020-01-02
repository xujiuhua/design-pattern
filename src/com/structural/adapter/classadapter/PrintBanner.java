package com.structural.adapter.classadapter;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class PrintBanner extends Banner implements Print{

    public PrintBanner(String s) {
        super(s);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }
}