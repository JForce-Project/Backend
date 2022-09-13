package com.example.esencul.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TestController {

    @RequestMapping(path = "/getName" , method = RequestMethod.GET)
    public String getName(){
        return "klavye";
    }
}
