package com.sales_portal.demo.data.repositories;

import com.sales_portal.demo.data.DAO.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository <Company, Integer>{
}
