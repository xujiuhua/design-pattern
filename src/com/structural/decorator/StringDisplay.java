package com.structural.decorator;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class StringDisplay extends Display {

    private String s;

    public StringDisplay(String s) {
        this.s = s;
    }

    @Override
    public int getColumns() {
        return s.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return s;
        } else {
            return null;
        }
    }
}
