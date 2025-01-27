package org.example.lowLevelDesign.structuralDesignPattern.compositeDesignPattern.calculator;

public class Client {
    public static void main(String[] args) {
        Operand num1 = new Operand(10);
        Operand num2 = new Operand(8);

        System.out.println("Addition operator : "+new AdditionOperator(num1, num2).evaluate());
        System.out.println("Multiplication operator : "+ new MultiplyOperator(num1, num2).evaluate());
    }


}
