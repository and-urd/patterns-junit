package com.patterns.behavioral.strategy.strategy1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShopCartTest {

    ShopCart trolley;

    @BeforeEach
    void setUp() {
        trolley = new ShopCart();
    }

    @Test
    void shopCartTest(){
        assertInstanceOf(ShopCart.class, trolley);
    }


}