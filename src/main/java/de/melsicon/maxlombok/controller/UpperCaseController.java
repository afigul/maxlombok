package de.melsicon.maxlombok.controller;

import de.melsicon.maxlombok.Service.ToUpperCaseService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UpperCaseController {
    private ToUpperCaseService toUpperCaseService;

    @RequestMapping("/uppercase/{text}")
    public String toUpperCase(@RequestParam String text) {
        return toUpperCaseService.toUpperCase(text);
    }
}
