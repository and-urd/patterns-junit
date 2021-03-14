package com.patterns.main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {


    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.log(Level.INFO,"Hola mundo!");

    }
}
