package com.sales_portal.demo.controllers;

import com.sales_portal.demo.data.services.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class MainController {

    private CompanyService companyService;

    @GetMapping("mvc/company/insert")
    public String insertCompany(){
        return "insertCompany";
    }

    @PostMapping("mvc/company/insert")
    public ModelAndView insertCompany(String company_name, String company_website, String phone_number, String company_address, String invoicing_details){
        companyService.insertCompany(company_name, company_website, phone_number, company_address, invoicing_details);
        return showAllCompanies();
    }

    @RequestMapping({"mvc/company/showAll","/"})
    public ModelAndView showAllCompanies(){
        ModelAndView mv = new ModelAndView("showCompanyList");
        mv.addObject("company", companyService.getAllCompanies());
        return mv;
    }

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