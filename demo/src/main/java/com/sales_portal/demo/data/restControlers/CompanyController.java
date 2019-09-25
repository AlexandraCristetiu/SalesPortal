package com.sales_portal.demo.data.restControlers;

import com.sales_portal.demo.data.DTO.CompanyDTO;
import com.sales_portal.demo.data.services.CompanyService;
import com.sales_portal.demo.data.services.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    private ICompanyService companyService;


//    @GetMapping("company/all")
//    public List<CompanyDTO> getAll() {
//        return companyService.getAllCompanies();
//    }

    @GetMapping("company/insert")
    public void insertCompany(String company_name, String company_address) {
        companyService.insertCompany(company_name, company_address);
    }
}

