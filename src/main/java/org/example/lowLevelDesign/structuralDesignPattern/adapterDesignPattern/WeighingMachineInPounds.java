package org.example.lowLevelDesign.structuralDesignPattern.adapterDesignPattern;

public class WeighingMachineInPounds {
    public double weightInPounds;

    public WeighingMachineInPounds(double weightInPounds){
        this.weightInPounds = weightInPounds;
    }

    public double getWeightInPounds(){
        return weightInPounds;
    }
}
