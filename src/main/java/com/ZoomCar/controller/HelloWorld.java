package com.ZoomCar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloWorld {

    @GetMapping("/{user}/How-you-doin/{surname}")
    public String Hello(@PathVariable String user,@PathVariable String surname){
        return "How are you "+ user+" "+surname;
    }
}
