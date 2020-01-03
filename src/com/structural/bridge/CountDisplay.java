package com.structural.bridge;

/**
 * <p>
 *
 *     类的功能层次接口：增加了新的功能
 *
 * </p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class CountDisplay extends Display{

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int cnt) {
        open();
        for (int i = 0; i < cnt; i++) {
            print();
        }
        close();
    }

}
