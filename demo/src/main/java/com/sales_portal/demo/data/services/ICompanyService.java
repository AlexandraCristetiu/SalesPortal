package com.sales_portal.demo.data.services;

import com.sales_portal.demo.data.DTO.CompanyDTO;

import java.util.List;
import java.util.Optional;

public interface ICompanyService {
   // List<CompanyDTO> getAllCompanies();

//  void modifyCompany(Integer id, Optional<String> name, Optional<String> email);
    void insertCompany(String name, String mail);
//    void deleteCompany(Integer id);
//    void changeInvoicingDetails(Integer userId,Optional<String> city, Optional<String> country,Optional<String> street );
//    String getUserName(Integer userId);

    // prin getServiceTitle se face conectarea la un serviciu extern
//    String getServiceTitle(Integer id) throws NotFoundException;
}
