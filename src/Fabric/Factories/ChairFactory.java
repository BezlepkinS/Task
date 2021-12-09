package Fabric.Factories;

import Fabric.Chairs.*;

public class ChairFactory implements AbstractChairFactory{

    @Override
    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }


    @Override
    public MagicChair createMagicianChair() {
        return new MagicChair();
    }


    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}