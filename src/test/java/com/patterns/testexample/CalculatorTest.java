package com.patterns.testexample;


import com.patterns.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void multiply() {
        Calculator calc = new Calculator();
        assertEquals(25, calc.multiply(5,5));
    }

    @Test
    void sumTest(){
        Calculator calc = new Calculator();
        assertEquals(7, calc.suma(3,4));
        System.out.println("Suma");

    }


    @Test
    void subTest(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.resta(4,3));
        System.out.println("Resta");
    }
}