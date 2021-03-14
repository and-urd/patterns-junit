package com.patterns.solid;

import com.patterns.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void calculadoraMultiplicarTest(){
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2,3));
    }

//Cambio2
// Cambio de carpeta



}