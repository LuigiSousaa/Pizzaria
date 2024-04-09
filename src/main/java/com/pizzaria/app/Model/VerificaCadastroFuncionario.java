package com.pizzaria.app.Model;

import java.io.Serializable;

import org.springframework.stereotype.Controller;

import jakarta.persistence.Id;
import lombok.*;

@Controller
@Getter
@Setter
public class VerificaCadastroFuncionario implements Serializable{
    //Atributos
    @Id
    private String cpf;
    private String nome;
    public boolean existsById(String cpf2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }
}
