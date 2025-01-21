package com.omar.homework.codeAlong;

import java.util.List;

public class NumberStats <T extends Number>{

    public double calculateAverage(List<T> numbers){
        double sum = 0;
        for(T number : numbers){
            sum+= number.doubleValue();
        }
        return sum/(numbers.size());
    }

    public T findMax(List<T> numbers){
        return numbers.stream()
                .sorted()
                .findFirst()
                .get();
    }



}
