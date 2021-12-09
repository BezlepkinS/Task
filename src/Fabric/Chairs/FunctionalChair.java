package Fabric.Chairs;

public class FunctionalChair implements Chair{

    public FunctionalChair(){}

    public int sum(int a, int b){
        return a + b;
    }

    @Override
    public void getChairType() {
        System.out.println("...You choose da Functional Chair...");
    }
}