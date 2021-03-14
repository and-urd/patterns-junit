package com.patterns.solid;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Car implements ICar{

    Logger logger= Logger.getLogger(Car.class.getName());
    @Override
    public void accelerate() {
        logger.log (Level.INFO, "accelerating the car");
    }

    @Override
    public void stop() {
        logger.log(Level.INFO,"stopping the car");
    }
}
