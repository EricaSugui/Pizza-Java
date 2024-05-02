package com.SoulCode.erica.PizzariaSoulCode.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="bebidas")
public class Bebida {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idBebida;

    @Getter
    @Setter
    @Column
    private String nome;
    @Getter
    @Setter
    @Column
    private float preco;

    public Bebida(){
        this.idBebida = idBebida;
    }
}
