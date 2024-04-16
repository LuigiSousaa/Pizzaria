package com.pizzaria.app.Repository;

import org.springframework.data.repository.CrudRepository;

import com.pizzaria.app.Model.VerificaCadastroFuncionario;

public interface VerificaCadastroFuncionarioRepository extends CrudRepository<VerificaCadastroFuncionario, String> {

    VerificaCadastroFuncionario findByCpf(String cpf);

}
