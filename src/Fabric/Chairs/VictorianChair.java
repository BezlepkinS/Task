package Fabric.Chairs;

public class VictorianChair implements Chair{
    private int age;

    public VictorianChair(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void getChairType() {
        System.out.println("...You choose da Victorian Chair...");
    }
}