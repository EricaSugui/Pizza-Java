package com.SoulCode.erica.PizzariaSoulCode.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//@Entity
@Table(name="bebidasPedidas")
public class BebidaPedida {
    @Getter
    @Setter
    @Column
    private Integer idBebida;
    @Getter
    @Setter
    @Column
    private long idPedido;
    @Getter
    @Setter
    @Column
    private int quantidade;

    @ManyToOne
    private Pedido pedido;
    @ManyToOne
    private Bebida bebida;
}
