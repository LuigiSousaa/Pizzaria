package com.pizzaria.app.Repository;

import org.springframework.data.repository.CrudRepository;

import com.pizzaria.app.Model.Funcionario;


public interface VerificaCadastroFuncionario extends CrudRepository<Funcionario, String>{
    
    VerificaCadastroFuncionario findByCpf(String cpf);

}
