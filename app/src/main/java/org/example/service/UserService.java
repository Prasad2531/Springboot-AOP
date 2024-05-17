package org.example.service;

import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private User user = new User("Prasad",23,"Pune");

    public void logIn(){
        System.out.println("Logging User In!");
    }

    public void logOut(){
        System.out.println("Logging user out!");
    }
}
