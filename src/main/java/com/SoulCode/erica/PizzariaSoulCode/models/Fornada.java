package com.SoulCode.erica.PizzariaSoulCode.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="fornadas")
public class Fornada {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idFornada;
    @Getter
    @Setter
    @Column
    private int numFornada;
    @Getter
    @Setter
    @Column
    private int qtdPizzas;

    public Fornada(){
        this.idFornada = idFornada;
    }
}
