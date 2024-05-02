package com.SoulCode.erica.PizzariaSoulCode.controller;

import com.SoulCode.erica.PizzariaSoulCode.models.Cliente;
import com.SoulCode.erica.PizzariaSoulCode.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {
    @Autowired
    private ClienteRepository usuarioRepository;
    @RequestMapping(value="/cadcliente", method = RequestMethod.POST)
    public Cliente save(@RequestBody Cliente cliente) {
        return usuarioRepository.save(cliente);
    }
    @RequestMapping(value="/listaclientes", method = RequestMethod.GET)
    public List<Cliente> findAll(){
        return usuarioRepository.findAll();
    }
    @RequestMapping(value="mostrarcliente/{id}", method = RequestMethod.GET)
    public Cliente findById(@PathVariable Long id){
        Optional<Cliente> cliente = usuarioRepository.findById(id);
        if(cliente.isPresent()){
            return cliente.get();
        } else {
            throw new RuntimeException("cliente não encontrado");
        }
    }
}
