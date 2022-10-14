package com.student.level1.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;
    public int binarySearch(int[] numbers, int numberToSearchFor){
        // 1.1 - Implement Sorting Logic, so you had to choose
        int [] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        // 2 - Search the array
        // 3 - Return the result
        return 3;
    }

    //@PostConstruct
    public void postConstruct(){
        logger.info("postConstruct");
    }
    //@PreDestroy
    public void preDestroy(){
        logger.info("PreDestroy");
    }
}
