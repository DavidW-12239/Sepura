package org.sepura.controller;

import org.sepura.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class SubscriptionController {
    @Autowired
    SubscriptionService subscriptionService;

    @PostMapping("/subscribe")
    public String subscribe(@RequestParam("email") String email, Model model){
        System.out.println(email);
        if (email==""){
            model.addAttribute("emailMsg","Email address cannot be empty");
        } else {
            subscriptionService.addSubscription(email);
        }
        return "/index";
    }
}
