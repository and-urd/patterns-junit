package com.patterns.solid;

public class Main {

    public static void main(String[] args) throws ErrorTipoDeCocheNoValido {

        String carType = "electric";

        ICar car;
        if (carType.equals("car")) {
            car = new Car();
        } else if (carType.equals("electric")) {
            car = new ElectricCar();
        }else{
            throw new ErrorTipoDeCocheNoValido("Invalid car");
        }
        car.accelerate();
    }
}
