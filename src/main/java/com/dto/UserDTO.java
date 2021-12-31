package com.dto;

import com.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Optional;

@NoArgsConstructor
@Getter
@Setter
public class UserDTO implements Serializable {
    String id;
    String name;
    String email;

    public UserDTO(User obj){
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }


    public UserDTO(Optional<User> obj) {
    }
}
