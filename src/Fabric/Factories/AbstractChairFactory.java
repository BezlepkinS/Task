package Fabric.Factories;

import Fabric.Chairs.*;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicianChair();
    FunctionalChair createFunctionalChair();
}
