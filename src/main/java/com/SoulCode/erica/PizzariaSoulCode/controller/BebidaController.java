package com.SoulCode.erica.PizzariaSoulCode.controller;

import com.SoulCode.erica.PizzariaSoulCode.models.Bebida;
import com.SoulCode.erica.PizzariaSoulCode.repositories.BebidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BebidaController {

    @Autowired
    private BebidaRepository bebidaRepository;
    @RequestMapping(value="/cadbebida", method = RequestMethod.POST)
    public Bebida save(@RequestBody Bebida bebida) {
        return bebidaRepository.save(bebida);
    }

    @RequestMapping(value="/listabebidas", method = RequestMethod.GET)
    public List<Bebida> findAll(){
        return bebidaRepository.findAll();
    }

    @RequestMapping(value="/mostrarbebida/{id}", method = RequestMethod.GET)
    public Bebida findById(@PathVariable Integer id) {
        Optional<Bebida> bebida = bebidaRepository.findById(id);
        if(bebida.isPresent()){
            return bebida.get()
        } else {
            throw new RuntimeException("bebida não encontrada");
        }
    }
}
