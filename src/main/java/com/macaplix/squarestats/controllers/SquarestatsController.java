package com.macaplix.squarestats.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquarestatsController {
    @GetMapping("/test")
    String testMethod()
    {
        return "Connection rest ok";
    }
}
