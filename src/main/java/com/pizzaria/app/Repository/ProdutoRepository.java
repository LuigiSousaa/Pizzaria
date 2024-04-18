package com.pizzaria.app.Repository;

import org.springframework.data.repository.CrudRepository;

import com.pizzaria.app.Model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

    Produto findById(int id);
}
