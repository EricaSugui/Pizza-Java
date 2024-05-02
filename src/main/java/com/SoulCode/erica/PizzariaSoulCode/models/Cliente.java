package com.SoulCode.erica.PizzariaSoulCode.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idCliente;

    @Getter
    @Setter
    @Column(length = 100, nullable = false)
    private String nome;
    @Getter
    @Setter
    @Column(length = 20, nullable = false)
    private String telefone;
    @Getter
    @Setter
    @Column(length = 200, nullable = false)
    private String endereco;
    @Getter
    @Setter
    @Column(length = 30, nullable = false)
    private String login;
    @Getter
    @Setter
    @Column(length = 30, nullable = false)
    private String senha;

    public Cliente(){
        this.idCliente = idCliente;
    }


}
