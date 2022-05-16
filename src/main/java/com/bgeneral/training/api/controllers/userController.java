package com.bgeneral.training.api.controllers;

import java.util.ArrayList;

import com.bgeneral.training.api.models.person;
import com.bgeneral.training.api.services.userServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/usuario")
public class userController {

    @Autowired
    userServices userServices;

    @GetMapping
    public ArrayList<person> obtenerUsuario(){
        return userServices.obtenerUsuario();
    }
    
    @PostMapping
    public person guardarUsuario(@RequestBody person person){
        return this.userServices.guardarUsuario(person);
    }
}
