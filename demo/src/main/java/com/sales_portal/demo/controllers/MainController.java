package com.sales_portal.demo.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class MainController {
//    private UserService userService;
//
//    @RequestMapping("/mvc/greet/{userId}")
//    public String greet(Model model, @PathVariable Integer userId){
//        model.addAttribute("userName",userService.getUserName(userId));
//        return "welcome";
//    }
//    @RequestMapping("mvc/user/showAll")
//    public ModelAndView greet(){
//        ModelAndView mv = new ModelAndView("users");
//        mv.addObject("users", userService.getAllUsers());
//        return mv;
//    }
}