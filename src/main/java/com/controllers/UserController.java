package com.controllers;

import com.dto.UserDTO;
import com.model.User;
import com.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping (value = "/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserDTO>> findAll(){
        List<User> list = userService.findAll();
        /*Na linha abaixo eu converto cada objeto da lista original acima em um objeto de DTO*/
        List<UserDTO> dtoList = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(dtoList);
    }
}

        /*User maria = new User(1L, "Maria", "maria@gmail.com");
        User pedro = new User(2L, "Maria", "maria@gmail.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, pedro));*/