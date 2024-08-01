package com.priyanka.spring.basics.spring_in_5_steps.cdi;

import com.priyanka.spring.basics.spring_in_5_steps.SpringIn5StepsBasicApplication;
import com.priyanka.spring.basics.spring_in_5_steps.basic.BinarySearchImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

//load the context
@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

    //Inject Mock
    @InjectMocks
    SomeCdiBusiness business;

    //Create Mock
    @Mock
    SomeCdiDao daoMock;
    @Test
    public void testBasicScenario(){
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,4});

        assertEquals(4,business.findGreatest());


    }

    @Test
    public void testBasicScenario_Empty(){
        Mockito.when(daoMock.getData()).thenReturn(new int[]{});

        assertEquals(Integer.MIN_VALUE,business.findGreatest());

    }
    @Test
    public void testBasicScenario_Equal(){
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,2});

        assertEquals(2,business.findGreatest());

    }
}
