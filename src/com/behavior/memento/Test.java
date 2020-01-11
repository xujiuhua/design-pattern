package com.behavior.memento;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {

        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for (int i = 0; i < 10; i++) {

            System.out.println(i + "-->当前状态：" + gamer);

            gamer.bet();

            System.out.println("所持金钱为" + gamer.getMoney() + "元");

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("金钱数增加，保存游戏状态");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("金钱数减少，恢复以前状态");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }
}
