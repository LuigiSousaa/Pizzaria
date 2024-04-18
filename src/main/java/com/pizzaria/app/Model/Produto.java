package com.pizzaria.app.Model;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Produto implements Serializable{
    
    @Id
    private Integer id;
    private String nome;
    private String preco;
}
