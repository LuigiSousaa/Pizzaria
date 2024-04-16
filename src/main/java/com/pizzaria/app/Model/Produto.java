package com.pizzaria.app.Model;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Produto implements Serializable{
    
    @Id
    private String id;
    private String nome;
    private String preco;
}
