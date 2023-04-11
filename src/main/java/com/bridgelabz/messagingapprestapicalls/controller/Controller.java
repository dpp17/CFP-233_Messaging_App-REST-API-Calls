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

    //////////////////// ::  UC-2  :: ////////////////////
    @RequestMapping(value = "/queryparam", method = RequestMethod.GET)     //handle the all the Http request From User---need to define path and define method as get,post,put or delete
    public String message(@RequestParam(value = "name", defaultValue = "Bridgelabz") String name){
        return " Hello  "+ name;                                     //-->> localhost:8080/queryparam?message=<pass a String>
    }


}
