package com.patterns.testexample;

import com.patterns.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebaTest {
    @Test
    void cuadradoTest(){
        Calculator calculator = new Calculator();
        assertEquals(9, calculator.cuadrado(3.0));
    }
}
