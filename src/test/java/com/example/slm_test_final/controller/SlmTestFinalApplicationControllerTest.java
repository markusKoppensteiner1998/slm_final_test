package com.example.slm_test_final.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlmTestFinalApplicationControllerTest {

    @Test
    void messageLowerCaseTest(){

        SlmTestFinalApplicationController slmTestFinalApplicationController = new SlmTestFinalApplicationController();

        assertEquals(slmTestFinalApplicationController.message("world"), "wOrLd");

    }

    @Test
    void messageUpperCaseTest(){

        SlmTestFinalApplicationController slmTestFinalApplicationController = new SlmTestFinalApplicationController();

        assertEquals(slmTestFinalApplicationController.message("WORLD"), "wOrLd");

    }

    @Test
    void messageMixedCaseTest(){

        SlmTestFinalApplicationController slmTestFinalApplicationController = new SlmTestFinalApplicationController();

        assertEquals(slmTestFinalApplicationController.message("HeLlO"), "hElLo");

    }

}