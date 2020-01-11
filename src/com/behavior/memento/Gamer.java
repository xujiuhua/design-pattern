package com.behavior.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();;
    private Random random = new Random();
    private static String[] fruitsname = {
            "苹果","葡萄","香蕉","橘子"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("金钱数增加");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("金钱数减半");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("获得水果：" + f);
            fruits.add(f);
        } else {
            System.out.println("什么都没发生");
        }
    }

    public Memento createMemento() {
        Memento memento = new Memento(money);
        fruits.stream().filter(a -> a.startsWith("好吃的"))
                .forEach(memento::addFruit);
        return memento;
        
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }
    
    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                ", random=" + random +
                '}';
    }
}
