package com.behavior.strategy;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public interface Strategy {
    Hand nextHand();

    void study(boolean win);
}
