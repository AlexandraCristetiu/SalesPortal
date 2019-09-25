package com.sales_portal.demo.data.DTO;

import com.sales_portal.demo.data.DAO.Company;
import lombok.Getter;

@Getter
public class CompanyDTO {


    private String company_name;
    private String company_website;
    private String company_address;
    private String phone_number;
    private String invoicing_details;

    public CompanyDTO( String company_name,
                      String company_website, String company_address, String phone_number, String invoicing_details) {

        this.company_name = company_name;
        this.company_website = company_website;
        this.company_address = company_address;
        this.phone_number = phone_number;
        this.invoicing_details = invoicing_details;
    }
}
