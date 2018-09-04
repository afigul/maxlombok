package de.melsicon.maxlombok.controller;

import de.melsicon.maxlombok.datamodel.HelloWorld;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public HelloWorld greeting() {
        return HelloWorld.builder().build();
    }

}
