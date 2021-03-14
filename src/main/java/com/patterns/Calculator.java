package com.patterns;

public class Calculator {

    /**
     * It multiplies two numbers
     * @param num1
     * @param num2
     * @return
     */
    public double multiply(double num1, double num2){
        // multiply two doubles
        return num1 * num2;
    }

    public double cuadrado(double num1){
        return num1*num1;
    }

    public double suma(double x, double y){
        return x + y;
    }

    public double resta(double x, double y){
        return x - y;
    }
}
