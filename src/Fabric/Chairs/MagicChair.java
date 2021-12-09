package Fabric.Chairs;

public class MagicChair implements Chair{

    public MagicChair(){}

    public void doMagic(){ System.err.println("Дружба — это чудо");}

    @Override
    public void getChairType() {
        System.out.println("...You choose da Magic Chair...");
    }
}