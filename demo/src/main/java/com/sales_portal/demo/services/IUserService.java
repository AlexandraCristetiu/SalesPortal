package com.sales_portal.demo.services;

import com.sales_portal.demo.data.DTO.UserDTO;

import java.util.List;

public interface IUserService {
    List<UserDTO> getAllUsers();
    String getEmailAddress(String emailAddress);
    String getServiceTitle(Integer id) throws NotFoundException;
}
