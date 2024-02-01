package com.revature.jenkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping("name-convert-to-uppercase")
@RestController
public class Controller {
    @GetMapping("/{name}")
    public String upperCase(@PathVariable (value = "name") String name){
        return "Hello "+name.toUpperCase();
    }
}
