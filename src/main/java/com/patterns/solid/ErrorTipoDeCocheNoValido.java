package com.patterns.solid;

public class ErrorTipoDeCocheNoValido extends Throwable {
    public ErrorTipoDeCocheNoValido(String invalid_car) {
        super(invalid_car);
    }
}
