package Fabric;

import Fabric.Chairs.*;

public class Client {

    public Chair chair;

    public Client(){ }
    public Client(Chair chair){
        this.chair = chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit(Chair chair) {
        if (chair.getClass() == FunctionalChair.class) {
            System.out.println("Client is sitting on Functional Chair");
            int z = ((FunctionalChair) chair).sum(1, 2);
            System.out.println(z);
        } else if (chair.getClass() == VictorianChair.class) {
            System.out.println("Client is sitting on Victorian Chair");
            System.out.println(((VictorianChair) chair).getAge());
        }
        else if (chair.getClass() == MagicChair.class) {
            System.out.println("Client is sitting on Magic Chair");
            ((MagicChair) chair).doMagic();
        }
        else throw new RuntimeException("Такого стула не бывает в нашем магазине иди отсюда");
    }
}