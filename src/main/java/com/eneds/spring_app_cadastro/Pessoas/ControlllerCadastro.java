package com.eneds.spring_app_cadastro;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControlllerCadastro {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "This is my first route in this API";

    }



}
