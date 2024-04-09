package com.pizzaria.app.Model;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Funcionario implements Serializable {

    // Atributos
    @Id
    private String cpf;
    private String nome;
    private String senha;
}
