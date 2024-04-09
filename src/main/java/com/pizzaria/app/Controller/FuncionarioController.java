package com.pizzaria.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pizzaria.app.Model.Funcionario;
import com.pizzaria.app.Model.VerificaCadastroFuncionario;
import com.pizzaria.app.Repository.FuncionarioRepository;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class FuncionarioController {

    @Autowired
    FuncionarioRepository fr;

    @Autowired
    VerificaCadastroFuncionario vcf;

    @PostMapping("cadastrar-func")
    public String cadastraFuncionario(Funcionario func) {        
        boolean verificaCad = vcf.existsById(func.getCpf());
        if (verificaCad) {
            fr.save(func);
            System.out.println("Deu green");
            return "redirect:/login-funcionario";
        } else {
            System.out.println("Deu red");
        }
        return "cadastro/cadastro-funcionario";
    }
    
    
}
