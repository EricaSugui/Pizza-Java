package com.SoulCode.erica.PizzariaSoulCode.controller;

import com.SoulCode.erica.PizzariaSoulCode.models.Fornada;
import com.SoulCode.erica.PizzariaSoulCode.repositories.FornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FornadaController {
    @Autowired
    private FornadaRepository fornadaRepository;

    @RequestMapping(value="/cadfornada", method = RequestMethod.POST)
    public Fornada save(@RequestBody Fornada fornada){
        return fornadaRepository.save(fornada);
    }
}
