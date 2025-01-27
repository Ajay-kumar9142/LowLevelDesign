package org.example.lowLevelDesign.structuralDesignPattern.compositeDesignPattern.calculator;

public class MultiplyOperator extends Operator{

    public MultiplyOperator(Expression leftOperand, Expression rightOperand){
        super(leftOperand, rightOperand);
    }
    @Override
    public int evaluate() {
        return leftOperand.evaluate()* rightOperand.evaluate();
    }
}
