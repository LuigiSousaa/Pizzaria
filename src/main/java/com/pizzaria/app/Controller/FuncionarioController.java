package com.pizzaria.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pizzaria.app.Model.Funcionario;
import com.pizzaria.app.Repository.FuncionarioRepository;
import com.pizzaria.app.Repository.VerificaCadastroFuncionarioRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FuncionarioController {

    @Autowired
    FuncionarioRepository fr;

    @Autowired
    VerificaCadastroFuncionarioRepository vcfr;

    boolean acessoFuncionario = false;

    @PostMapping("cadastrar-func")
    public String cadastraFuncionario(Funcionario func) {
        boolean verificaCpf = vcfr.existsById(func.getCpf());
        if (verificaCpf) {
            fr.save(func);
            System.out.println("Deu green");
            return "redirect:/login-funcionario";
        } else {
            System.out.println("Deu red");
        }
        return "cadastro/cadastro-funcionario";
    }

    @PostMapping("acesso-interna")
    public String acessoPagInternaFuncionario(@RequestParam String cpf, @RequestParam String senha) {
        boolean verificaCpf = fr.existsById(cpf);
        boolean verificaSenha = fr.findByCpf(cpf).getSenha().equals(senha);
        String url = "";
        if (verificaCpf && verificaSenha) {
            acessoFuncionario = true;
            url = "redirect:/interna-funcionario";
        } else {
            url = "redirect:/login-funcionario";
        }
        return url;
    }
}
