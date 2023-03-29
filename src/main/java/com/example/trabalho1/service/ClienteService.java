package com.example.trabalho1.service;

import com.example.trabalho1.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClienteService {

    public void criarClientes(ArrayList<Cliente> lista) {
        Cliente c1 = new Cliente();
        c1.setNome("Gustavo");
        c1.setCnpj("1");
        c1.setNomerestaurante("BubuzinFood");
        lista.add(c1);
    }


}
