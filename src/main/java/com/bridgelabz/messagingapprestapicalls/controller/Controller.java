package com.bridgelabz.messagingapprestapicalls.controller;

import com.bridgelabz.messagingapprestapicalls.model.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    //////////////////// ::  UC-1  :: ////////////////////
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String message(){
        return "Hello from BridgeLabz";
    }

}
