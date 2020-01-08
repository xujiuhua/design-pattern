package com.behavior.chain;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Support no = new NoSupport("no");
        Support limit = new LimitSupport("limit", 10);
        Support odd = new OddSupport("odd");

        // 构建职责链
        no.setNext(limit).setNext(odd);

        // 制造各种问题
        for (int i = 0; i < 20; i++) {
            no.support(new Trouble(i));
        }
    }
}
