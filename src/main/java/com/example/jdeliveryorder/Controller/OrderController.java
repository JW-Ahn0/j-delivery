package com.example.jdeliveryorder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class OrderController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/order")
    @ResponseBody
    public String order(){
        return "aa";
    }
}
