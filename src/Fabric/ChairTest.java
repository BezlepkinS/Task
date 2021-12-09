package Fabric;

import java.util.Scanner;
import Fabric.Chairs.*;
import Fabric.Factories.AbstractChairFactory;
import Fabric.Factories.ChairFactory;

public class ChairTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ch = scanner.next();
        Chair chair = createChairByCh(ch);

        chair.getChairType();
        Client client = new Client();
        client.sit(chair);
    }

    static Chair createChairByCh(String ch) {
        AbstractChairFactory factory = new ChairFactory();
        if (ch.equalsIgnoreCase("Magic")) {
            return factory.createMagicianChair();
        } else if (ch.equalsIgnoreCase("Victorian")) {
            return factory.createVictorianChair(110);
        } else if (ch.equalsIgnoreCase("Functional")) {
            return factory.createFunctionalChair();
        } else {
            throw new RuntimeException(ch + " is unknown speciality");
        }
   }
}
