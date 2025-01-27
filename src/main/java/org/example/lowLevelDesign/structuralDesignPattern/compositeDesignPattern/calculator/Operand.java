package org.example.lowLevelDesign.structuralDesignPattern.compositeDesignPattern.calculator;

public class Operand implements Expression{
    int value;

    public Operand(int value){
        this.value = value;
    }
    @Override
    public int evaluate() {
        return value;
    }
}
