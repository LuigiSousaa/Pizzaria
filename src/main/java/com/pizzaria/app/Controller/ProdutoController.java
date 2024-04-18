package com.pizzaria.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pizzaria.app.Model.Produto;
import com.pizzaria.app.Repository.ProdutoRepository;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProdutoController {
    
    @Autowired
    ProdutoRepository pr;

    @PostMapping("cadastra-produto")
    public String cadastraProduto(@ModelAttribute Produto produto) {
        pr.save(produto);
        return "redirect:/interna-funcionario";
    }
    

}
