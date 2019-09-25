package com.sales_portal.demo.data.repositories;

import com.sales_portal.demo.data.DAO.Projects;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Projects, Integer> {
}
