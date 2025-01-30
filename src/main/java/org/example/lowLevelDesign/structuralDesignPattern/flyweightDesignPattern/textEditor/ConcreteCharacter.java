package org.example.lowLevelDesign.structuralDesignPattern.flyweightDesignPattern.textEditor;

public class ConcreteCharacter implements TextCharacter {
    char symbol;

    public ConcreteCharacter(char symbol){
        this.symbol = symbol;
    }
    @Override
    public void display(int fontSize, String fontStyle) {
        System.out.println("Symbol : "+symbol + ", fontSize : "+fontSize +", fontStyle : "+fontStyle);
    }
}
