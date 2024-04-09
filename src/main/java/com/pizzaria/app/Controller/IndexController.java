package com.pizzaria.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping("/cadastro-func")
    public String paginaCadastroFuncionario() {
        return "cadastro/cadastro-funcionario";
    }
}
