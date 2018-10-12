package de.melsicon.maxlombok.controller;

import de.melsicon.maxlombok.datamodel.HelloWorld;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String greeting() {
        String text = "Welcome to this little Lombok Example. " +
                "</br> Urls that work: </br>" +
                "<a href='http://localhost:8080/showchild'>localhost:8080/showchild</a>" +
                "<a href='http://localhost:8080/uppercase/{text}'>/uppercase/{text}</a>" +
                "<a href='http://localhost:8080/json/'>/json</a>";
        return text;
    }

    @RequestMapping("/json")
    public HelloWorld hello() {
        return HelloWorld.builder().build();
    }

}
