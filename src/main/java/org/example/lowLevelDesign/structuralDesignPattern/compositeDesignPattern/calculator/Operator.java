package org.example.lowLevelDesign.structuralDesignPattern.compositeDesignPattern.calculator;

public abstract class Operator implements Expression{
    protected Expression leftOperand;
    protected Expression rightOperand;

    public Operator(Expression leftOperand, Expression rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

}
