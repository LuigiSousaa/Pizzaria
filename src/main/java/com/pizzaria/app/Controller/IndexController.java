package com.pizzaria.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class IndexController {

    @GetMapping("/home")
    public String paginaHome() {
        return "index";
    }

    @GetMapping("/login-funcionario")
    public String paginaLoginFuncionario() {
        return "login/login-funcionario";
    }

    @GetMapping("/cadastro-funcionario")
    public String paginaCadastroFuncionario() {
        return "cadastro/cadastro-funcionario";
    }

    @GetMapping("/interna-funcionario")
    public String paginaInternaFuncinario() {
        return "interna/interna-funcionario";
    }

    @GetMapping("/cadastro-produto")
    public String paginaCadastrarProduto() {
        return "interna/cadastrar-produto";
    }
    
    
}
