package com.example.trabalho1.controller;

import com.example.trabalho1.Cliente;
import com.example.trabalho1.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class ControllerCliente {

    @Autowired
    ClienteService CS;


    @RequestMapping(value = "/teste", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Cliente> respostaTeste(){
        ArrayList<Cliente> teste = new ArrayList<>();
        CS.criarClientes(teste);
        return teste;
    }
    @RequestMapping("/telateste")
    public String telaTeste(){
        return "teste";
    }


}
