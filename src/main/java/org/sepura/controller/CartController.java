package org.sepura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@Controller
public class CartController {

    @GetMapping(value = "/addToCart")
    public String addToCart(HttpSession session){
        if (session.getAttribute("cartQuantity") != null){
            int num = (int) session.getAttribute("cartQuantity");
            num++;
            session.setAttribute("cartQuantity", num);
        }

        return "redirect:/";
    }
}
