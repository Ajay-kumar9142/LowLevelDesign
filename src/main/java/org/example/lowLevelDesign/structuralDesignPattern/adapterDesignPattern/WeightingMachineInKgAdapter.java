package org.example.lowLevelDesign.structuralDesignPattern.adapterDesignPattern;

public class WeightingMachineInKgAdapter implements WeightingMachineInKg{
    WeighingMachineInPounds weighingMachineInPounds;

    public WeightingMachineInKgAdapter(WeighingMachineInPounds weighingMachineInPounds){
        this.weighingMachineInPounds = weighingMachineInPounds;
    }
    @Override
    public double getWeightInKg() {
        return weighingMachineInPounds.getWeightInPounds()*0.45;
    }
}
