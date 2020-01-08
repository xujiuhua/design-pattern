package com.behavior.observer;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class ConcreteObserver1 extends Observer{
    @Override
    void response() {
        System.out.println("具体观察者1做出反应");
    }
}
