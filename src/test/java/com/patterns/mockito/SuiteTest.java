package com.patterns.mockito;

import com.patterns.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuiteTest {

    @Test
    void calculculatorTest(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.suma(1,1));
    }


}
