package com.exampleOne.ByMyselfOne;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ControllerClass {
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }
    @GetMapping("/sec")
    public String second(@RequestParam(value = "name",defaultValue = "Guest") String name){
        return "Second String is " + name;
    }
    @GetMapping("/third/{id}")
    public String third(@PathVariable Long id){
        return "User with Id "+ id;
    }
}
