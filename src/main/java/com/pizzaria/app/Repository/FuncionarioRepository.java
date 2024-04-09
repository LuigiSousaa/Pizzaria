package com.pizzaria.app.Repository;

import org.springframework.data.repository.CrudRepository;

import com.pizzaria.app.Model.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, String> {

    Funcionario findByCpf(String cpf);
}
