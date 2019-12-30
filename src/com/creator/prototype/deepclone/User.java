package com.creator.prototype.deepclone;

import java.io.*;

/**
 * <p>
 * <p>
 * 引用对象单独处理
 *
 * </p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */

public class User implements Cloneable, Serializable {

    private String name;

    private Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        Address address = ((User) clone).getAddress();
        ((User) clone).setAddress((Address) address.clone());
        return clone;
    }

    public Object deepClone() {


        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 妙，当前这个对象以对象流方式输出
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            User user = (User) ois.readObject();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
