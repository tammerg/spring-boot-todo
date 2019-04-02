package com.todo.springboot.firstspringtodo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }
}
