package uz.ages.market.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/hello")
    public String method() {
        return "Hello world";
    }

    @GetMapping("/git")
    public String git() {
        return "Hello gitt";
    }

}
