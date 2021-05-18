package com.examplefirstproject.first.spring.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping
public class firstController {

//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParameter(@RequestParam String name) {
//        return "Hello, " + name + "!";
//    }
//
//
//    @RequestMapping("{name}")
//    public String helloWithPathParameter(@RequestParam String name) {
//        return "Hello, " + name + "!";
//    }

    @RequestMapping(method = RequestMethod.GET)
    public String helloForm(){
        return "<form method='post'>" +
                "<input type = 'text' name='name'>" +
                "<select name = 'language'>" +
                "<option value = 'english'> English </option>" +
                "<option value = 'spanish'> Spanish </option>" +
                "<option value = 'german'> German </option>" +
                "<select name = 'language'>" +
                "</select>" +
                "<input type = 'submit' value = 'Greet Me' />" +
                "</form>";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createMessage(@RequestParam String name, @RequestParam String language){
        if (name == null){
            name = "World";
        }

        String greeting = "";

        if (language.equals("english")) {
            greeting = "Hello";
        } else if (language.equals("spanish")){
            greeting = "Hola";
        } else if (language.equals("german")){
            greeting = "Hallo";
        }

        return greeting + " " + name;
    }

}
