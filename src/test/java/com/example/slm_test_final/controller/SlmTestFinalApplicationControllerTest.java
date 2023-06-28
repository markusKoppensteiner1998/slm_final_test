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

    @Test
    void getLengthLastWortStandardOutput(){
        SlmTestFinalApplicationController slmTestFinalApplicationController = new SlmTestFinalApplicationController();
        assertEquals(slmTestFinalApplicationController.getLengthLastWort(),0);
    }

    @Test
    void getLengthLastWortAfterMessageChanged(){
        SlmTestFinalApplicationController slmTestFinalApplicationController = new SlmTestFinalApplicationController();

        slmTestFinalApplicationController.message("Hello");

        assertEquals(slmTestFinalApplicationController.getLengthLastWort(),5);
    }

    @Test
    void getLengthLastWortAfterMessageChangedSeveralTimes(){
        SlmTestFinalApplicationController slmTestFinalApplicationController = new SlmTestFinalApplicationController();

        slmTestFinalApplicationController.message("Hello");
        slmTestFinalApplicationController.message("hoffeDieUmsetzungpasst");

        assertEquals(slmTestFinalApplicationController.getLengthLastWort(),22);
    }

}