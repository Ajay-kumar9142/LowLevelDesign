package org.example.lowLevelDesign.behavioralDesignPattern.strategyPattern;

import java.util.List;

public class SortingContext {

    SorterStrategy sorterStrategy;

    public SortingContext(SorterStrategy sorterStrategy){
        this.sorterStrategy = sorterStrategy;
    }

    public void setSorterStrategy(SorterStrategy sorterStrategy){
        this.sorterStrategy = sorterStrategy;
    }

    public void sort(List<Integer> numbers){
        sorterStrategy.sortNumbers(numbers);
    }

}
