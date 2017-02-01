package com.mmik.trainings.springbootdocker.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mehdi on 27/01/17.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String sayHello(){
        return "Hello World, I'm Mehdi !";
    }
}
