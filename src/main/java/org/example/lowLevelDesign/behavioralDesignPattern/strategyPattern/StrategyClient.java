package org.example.lowLevelDesign.behavioralDesignPattern.strategyPattern;

import java.util.Arrays;
import java.util.List;

public class StrategyClient {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8, 9, 10, 79, 34, 2);
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        sortingContext.sort(numbers);

        //switch to different strategy
        sortingContext.setSorterStrategy(new QuickSortStrategy());
        sortingContext.sort(numbers);
    }

}
