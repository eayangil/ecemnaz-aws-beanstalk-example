package com.ecemnaz.aws;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloContoller {
    public String hello() {
        return "Hello World";
    }
}
