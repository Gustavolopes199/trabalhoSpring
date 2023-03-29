package com.example.trabalho1;

import com.example.trabalho1.service.ClienteService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@Getter
@Setter
public class Cliente {

    private String cnpj;
    private String nome;
    private String nomerestaurante;


    ArrayList<Cliente> clientes = new ArrayList<>();

    @Autowired
    ClienteService CS;




}
