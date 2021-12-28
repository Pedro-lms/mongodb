package com.config;

import com.model.User;
import com.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User maria = new User(null, "Maria", "maria@gmail.com");
        User pedro = new User(null, "Pedro ", "pedro@gmail.com");
        User sadit = new User(null, "Sadit ", "sadit@gmail.com");

        userRepository.saveAll((Arrays.asList(maria, pedro, sadit)));
    }
}
