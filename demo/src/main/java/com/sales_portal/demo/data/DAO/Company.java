package com.sales_portal.demo.data.DAO;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer company_id;
    private String company_name;
    private String company_website;
    private String company_address;
    private String phone_number;
    private String invoicing_details;

    @ManyToMany(mappedBy = "company_name")
    @JoinTable(name = "company_to_contact")
    private Set<Contact> contact;


}
