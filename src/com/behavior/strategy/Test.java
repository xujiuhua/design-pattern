package com.behavior.strategy;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        Player player1 = new Player("zs", new WinningStrategy(100));
        Player player2 = new Player("ls", new WinningStrategy(200));
        for (int i = 0; i < 100; i++) {
            Hand hand1 = player1.netHand();
            Hand hand2 = player2.netHand();
            if (hand1.isStrongerThan(hand2)) {
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            } else if (hand1.isWeakThan(hand2)) {
                System.out.println("Winner:" + player2);
                player2.win();
                player1.lose();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println(player1);
        System.out.println(player2);
    }
}
