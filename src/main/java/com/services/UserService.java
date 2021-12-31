package com.services;

import com.dto.UserDTO;
import com.model.User;
import com.repositories.UserRepository;
import com.services.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){

        return userRepository.findAll();
    }

    public Optional<User> findOne(String id){
        Optional<User> user = userRepository.findById(id);
        if (user == null){
            throw new ObjectNotFoundException("Elemento não encontrado");
        }
        return user;
    }

    public User insert (User obj){
        return userRepository.insert(obj);
    }

    public User fromDTO (UserDTO objDTO){
        return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }

}
