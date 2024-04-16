package com.pizzaria.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pizzaria.app.Repository.ProdutoRepository;

@Controller
public class ProdutoController {
    @Autowired
    ProdutoRepository pr;
}
