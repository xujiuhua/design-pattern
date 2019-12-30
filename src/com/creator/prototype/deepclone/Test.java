package com.creator.prototype.deepclone;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {


        Address address = new Address();
        address.setName("北京");

        User user = new User();
        user.setName("张三");
        user.setAddress(address);

        // 方式1：clone
//        User user2 = (User) user.clone();

        // 方式2：序列化、反序列化
        User user2 = (User) user.deepClone();


        System.out.println(user == user2);
        user2.getAddress().setName("上海");
        System.out.println(user);
        System.out.println(user2);


    }



}
