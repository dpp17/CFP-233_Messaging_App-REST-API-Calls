package com.bridgelabz.messagingapprestapicalls.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloMessage")
public class HelloMessageController {

    //////////////////// ::  UC-1  :: ////////////////////
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String message(){
        return "Hello from BridgeLabz";
    }

}
