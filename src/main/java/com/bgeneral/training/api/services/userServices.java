package com.bgeneral.training.api.services;

import java.util.ArrayList;

import com.bgeneral.training.api.models.person;
import com.bgeneral.training.api.repositories.userRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServices {
    @Autowired
    userRepository userRepository;


    public ArrayList<person> obtenerUsuario(){
       return (ArrayList<person>) userRepository.findAll();
    }

    public  person guardarUsuario( person person){
        return userRepository.save(person);
    }
}
