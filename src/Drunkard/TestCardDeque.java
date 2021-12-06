package Drunkard;

import java.util.*;

public class TestCardDeque {

    private static Queue<Card> firstPool;
    private static Queue<Card> secondPool;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        firstPool = new ArrayDeque<>(5);
        secondPool = new ArrayDeque<>(5);

        System.out.print("Enter 5 cards of first player: ");
        for (int i = 0; i < 5; i++) {
            firstPool.offer(new Card(scanner.nextInt()));
        }

        System.out.print("Enter 5 cards of second player: ");
        for (int i = 0; i < 5; i++) {
            secondPool.offer(new Card(scanner.nextInt()));
        }

        startGame();

    }

    private static void startGame() {
        int rounds = 0;

        while (rounds < 106) {
            Card first = firstPool.poll();
            Card second = secondPool.poll();

            assert first != null;
            assert second != null;

            if ((first.getScore() == 0 && second.getScore() == 9)) {
                firstWon(first, second);
            } else if ((second.getScore() == 0 && first.getScore() == 9)) {
                secondWon(first, second);
            } else if (first.getScore() > second.getScore()) {
                firstWon(first, second);
            } else if (second.getScore() > first.getScore()) {
                secondWon(first, second);
            } else {
                draw(first, second);
            }
            rounds++;

            if (firstPool.isEmpty() || secondPool.isEmpty()) {
                break;
            }
        }

        if (firstPool.isEmpty()) {
            System.out.println("second " + rounds);
        } else if (secondPool.isEmpty()) {
            System.out.println("first " + rounds);
        } else {
            System.out.println("botva");
        }
    }

    private static void firstWon(Card first, Card second) {
        //firstPool.poll();
        firstPool.add(first);
        firstPool.add(second);
        //secondPool.poll();
    }

    private static void secondWon(Card first, Card second) {
        //secondPool.poll();
        secondPool.add(first);
        secondPool.add(second);
        //firstPool.poll();
    }

    private static void draw(Card first, Card second) {
        //firstPool.poll();
        firstPool.add(first);
        //secondPool.poll();
        secondPool.add(second);
    }
}