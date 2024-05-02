package com.SoulCode.erica.PizzariaSoulCode.controller;

import com.SoulCode.erica.PizzariaSoulCode.models.Pedido;
import com.SoulCode.erica.PizzariaSoulCode.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {
    @Autowired
    private PedidoRepository pedidoRepository;

    @RequestMapping(value="/cadpedido", method = RequestMethod.POST)
    public Pedido save(@RequestBody Pedido pedido){

        return pedidoRepository.save(pedido);
    }

}
