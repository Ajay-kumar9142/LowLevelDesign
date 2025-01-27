package org.example.lowLevelDesign.structuralDesignPattern.compositeDesignPattern.calculator;

public class AdditionOperator extends Operator{

    public AdditionOperator(Expression leftOperand, Expression rightOperand){
        super(leftOperand, rightOperand);
    }
    @Override
    public int evaluate() {
        return leftOperand.evaluate() + rightOperand.evaluate();
    }
}
