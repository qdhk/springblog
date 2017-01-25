package com.nr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by nr on 2017/01/25 0025.
 */
@Controller
public class MainController {
    @GetMapping("/{username}/blog/{blogId}")
    public String index(@PathVariable("username") String username,
                        @PathVariable("blogId") String blogId, ModelMap modelMap){
        modelMap.addAttribute(username);
        modelMap.addAttribute(blogId);
        return "index";
    }
}
