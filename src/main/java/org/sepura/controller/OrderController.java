package org.sepura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    @GetMapping(value = "/toOrderPage")
    public String order(){
        return "/";
    }
}
