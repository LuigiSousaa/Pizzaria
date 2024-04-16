package com.pizzaria.app.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
public class VerificaCadastroFuncionario implements Serializable{
    //Atributos
    @Id
    private String cpf;
    private String nome;
}
