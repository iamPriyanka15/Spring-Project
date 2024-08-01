package com.priyanka.spring.basics.spring_in_5_steps.basic;

import com.priyanka.spring.basics.spring_in_5_steps.SpringIn5StepsBasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

//load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/testContext.xml")
public class BinarySearchXmlConfigurationTest {

    //get this bean from the context
    @Autowired
    BinarySearchImpl binarySearch;
    @Test
    public void testBasicScenario(){
        //call method on BinarySearch
        int actualResult = binarySearch.binarySearch(new int[] {}, 5);

        //check if the value is correct
        assertEquals(3,actualResult);


    }
}
