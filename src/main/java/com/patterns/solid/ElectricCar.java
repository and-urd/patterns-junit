package com.patterns.solid;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ElectricCar implements ICar{

    Logger logger = Logger.getLogger(ElectricCar.class.getName());
    private int battery;

    @Override
    public void accelerate() {
        if (hasBattery()) {
            logger.log(Level.INFO,"accelerating the car");
        } else {
            logger.log(Level.INFO,"I can not accelerate the car");
        }
    }

    @Override
    public void stop() {
        logger.log(Level.INFO,"accelerating the car");
    }

    public boolean hasBattery() {
        logger.log(Level.INFO,"checking battery");
        if (battery < 95) {
            logger.log(Level.INFO,"the battery is very low :(");
            return false;
        } else {
            logger.log(Level.INFO,"battery OK :)");
            return true;
        }
    }
}
