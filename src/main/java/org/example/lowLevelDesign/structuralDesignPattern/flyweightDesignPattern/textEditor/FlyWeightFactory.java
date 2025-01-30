package org.example.lowLevelDesign.structuralDesignPattern.flyweightDesignPattern.textEditor;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

  private Map<Character, ConcreteCharacter> charMap = new HashMap<>();

  public TextCharacter getCharacter(char symbol){
      if(!charMap.containsKey(symbol)){
        charMap.put(symbol, new ConcreteCharacter(symbol));
      }
      return charMap.get(symbol);
  }

}
