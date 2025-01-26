package org.example.lowLevelDesign.behavioralDesignPattern.strategyPattern;

import java.util.List;

public class BubbleSortStrategy implements SorterStrategy {
    @Override
    public void sortNumbers(List<Integer> numbers) {
        //bubble sort implementation
        System.out.println("Sorting these numbers using bubble sort :"+ numbers);
    }
}
