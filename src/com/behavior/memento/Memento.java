package com.behavior.memento;

import java.util.ArrayList;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Memento {

    int money;
    ArrayList<String> fruits;

    public Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public ArrayList<String> getFruits() {
        return (ArrayList<String>) fruits.clone();
    }
}
