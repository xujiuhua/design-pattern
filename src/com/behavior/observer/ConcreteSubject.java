package com.behavior.observer;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class ConcreteSubject extends Subject{

    @Override
    public void notifyObserver() {
        System.out.println("具体目标改变");

        for (Observer observer : super.observerList) {
            observer.response();
        }
    }
}
