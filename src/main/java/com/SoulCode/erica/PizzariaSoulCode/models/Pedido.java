package com.SoulCode.erica.PizzariaSoulCode.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idPedido;
    @Getter
    @Setter
    @Column
    private long idCliente;
    @Getter
    @Setter
    @Column
    private int idFornada;
    @Getter
    @Setter
    @Column
    private Date dataHora;

    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Fornada fornada;

    public Pedido(){
        this.idPedido = idPedido;
    }
}
