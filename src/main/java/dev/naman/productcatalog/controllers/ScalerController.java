package dev.naman.productcatalog.controllers;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScalerController {
    @Autowired
//    private ApplicationContext context;

    @GetMapping("/hi")
    public String hiEveryone() {
//        context.ge
        return "Hey Scalersss Students HIIIIIII";
    }
}
