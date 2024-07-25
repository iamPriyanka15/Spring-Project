package com.priyanka.spring.basics.spring_in_5_steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgoritm {
    public int[] sort(int[] numbers){

        //logic for bubblesort

        return numbers;
    }

}
