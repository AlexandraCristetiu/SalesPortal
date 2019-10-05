package com.sales_portal.demo.services;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sales_portal.demo.data.DAO.Users;
import com.sales_portal.demo.data.DTO.UserDTO;
import com.sales_portal.demo.data.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("IUserService")
@AllArgsConstructor
public class UserService implements IUserService{
    private UserRepository userRepository;

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserDTO> users = new ArrayList<UserDTO>();
        Iterable<Users> all = userRepository.findAll();

        all.forEach(u -> users.add(new UserDTO(u)));
        return users;
    }

    @Override
    public String getEmailAddress(String emailAddress) {
        Optional<Users> users = userRepository.findByEmailAddress(emailAddress);

        return users.get().getEmailAddress();
    }
    @Override
    public String getServiceTitle(Integer id) throws NotFoundException {
        Optional<Users> users = userRepository.findById(id);
        // in programarea functionala in lambda trebuie sa fie valori finale, care nu se vor modifica pe parcurs
        //daca avem nevoie de variabile care is schimba valorile se va merge pe if clasic
        if(users.isPresent()){
            Users u = users.get();
            RestTemplate template = new RestTemplate();
            String url = "https://jsonplaceholder.typicode.com/todos/" + u.getUser_id();
            String response = template.getForObject(url, String.class);

            try {
                ObjectMapper mapper = new ObjectMapper();
                JsonNode root
                        = mapper.readTree(response);
                return root.path("title").asText();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        throw new NotFoundException();
    }
}
