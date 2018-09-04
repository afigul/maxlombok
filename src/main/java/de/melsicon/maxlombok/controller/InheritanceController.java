package de.melsicon.maxlombok.controller;

import de.melsicon.maxlombok.datamodel.Ancestor;
import de.melsicon.maxlombok.datamodel.Child;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InheritanceController {

    @RequestMapping("/showchild")
    public Child showChild() {
        return Child.builder().someNumber(121).name("Name").surname("Surname").build();
    }

    // this does not work with lombok
    /*@RequestMapping("/showancestor")
    public Ancestor showAncestor() {
        return Ancestor.builder().name("Name").surname("Surname").build();
    }*/
}
