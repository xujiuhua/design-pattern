package com.structural.adapter.delegateadapter;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class PrintBanner extends Print{

    private Banner banner;

    public PrintBanner(String s) {
        this.banner = new Banner(s);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }
}
