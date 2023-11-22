package ca.sheridancollege.controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller


public class MessageController
{
    @GetMapping("/saveMessage")
    public String saveMessage(HttpServletResponse response)
    {
        Cookie cookie = new Cookie("message", "message");
        response.addCookie(cookie);
        return "redirect:/index";
    }
}
