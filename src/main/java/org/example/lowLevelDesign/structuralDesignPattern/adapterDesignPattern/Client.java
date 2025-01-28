package org.example.lowLevelDesign.structuralDesignPattern.adapterDesignPattern;

public class Client {
    public static void main(String[] args) {
        WeighingMachineInPounds weighingMachineInPounds = new WeighingMachineInPounds(67);

        WeightingMachineInKg weightingMachineInKg = new WeightingMachineInKgAdapter(weighingMachineInPounds);

        System.out.println("Weight in kg : "+weightingMachineInKg.getWeightInKg());
    }
}
