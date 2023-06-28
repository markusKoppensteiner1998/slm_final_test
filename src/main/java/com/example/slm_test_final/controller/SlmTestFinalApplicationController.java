package com.example.slm_test_final.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlmTestFinalApplicationController {

    @RequestMapping("api/modify")
    public String message(@RequestParam String string){

        String returnValue = "";

        int endeString = 1;
        for (int i = 0; i < string.length(); i++) {

            if(i % 2 == 0) {
                returnValue = returnValue + string.toLowerCase().substring(i, endeString);
            }else{
                returnValue = returnValue + string.toUpperCase().substring(i, endeString);
            }
            endeString++;
        }
        return returnValue;
    }

}
