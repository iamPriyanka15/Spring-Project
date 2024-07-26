package com.priyanka.spring.basics.spring_in_5_steps.basic;

//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
@Autowired
@Qualifier("bubble")
    private SortAlgoritm sortAlgoritm ;

//    public BinarySearchImpl(SortAlgoritm sortAlgoritm) {
//        super();
//        this.sortAlgoritm = sortAlgoritm;
//    }

    public int binarySearch(int [] numbers, int numberToSearchFor){
        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortedNumbers =  bubbleSortAlgorithm.sort(numbers);
        System.out.println(sortAlgoritm);
        return 3;

    }

// @PostConstruct
//    public void PostConstruct(){
//        logger.info("PostConstruct");
//
// }
//
// @PreDestroy
//    public void Preconstruct(){
//        logger.info("PreConstruct");
// }

}
