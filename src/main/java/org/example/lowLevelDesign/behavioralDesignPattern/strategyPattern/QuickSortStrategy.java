package org.example.lowLevelDesign.behavioralDesignPattern.strategyPattern;

import java.util.List;

public class QuickSortStrategy implements SorterStrategy {
    @Override
    public void sortNumbers(List<Integer> numbers) {
        //implement quick sort strategy
        System.out.println("Sort these numbers using bubble sort:"+ numbers);
    }
}
