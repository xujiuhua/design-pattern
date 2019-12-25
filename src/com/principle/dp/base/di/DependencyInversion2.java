package com.principle.dp.base.di;

/**
 * <p>
 *    依赖倒转中心思想：面向接口编程
 *    抽象不应该依赖细节，细节应该依赖抽象
 *
 * </p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class DependencyInversion2 {

    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.receive(new Email2());
        person2.receive(new WeiXin());
    }
}

interface IReceiver {
    void getInfo();
}

class Email2 implements IReceiver{

    @Override
    public void getInfo() {
        System.out.println("Get Email Info.");
    }
}

class WeiXin implements IReceiver {

    @Override
    public void getInfo() {
        System.out.println("Get WeiXin Info.");
    }
}

class Person2 {
    public void receive(IReceiver receiver) {
        receiver.getInfo();
    }
}