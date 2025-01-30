package org.example.lowLevelDesign.structuralDesignPattern.flyweightDesignPattern.textEditor;

public class Editor {
    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();
        String str = "Hello";

        for(char c : str.toCharArray()){
            TextCharacter textCharacter = factory.getCharacter(c);
            textCharacter.display(12, "Bold");
        }
    }
}
