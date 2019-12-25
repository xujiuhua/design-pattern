package com.dp.base.di;

/**
 * <p> 依赖倒转 </p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class DependencyInversion1 {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public void getInfo() {
        System.out.println("Get Email Info.");
    }
}

/**
 * 如果我们获取的对象是微信、短信，则需要新增类，同时person需要新增方法
 */
class Person {
    public void receive(Email email) {
        email.getInfo();
    }
}