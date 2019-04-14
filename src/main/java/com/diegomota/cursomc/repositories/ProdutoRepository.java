package com.diegomota.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegomota.cursomc.domain.Produto;

//O pacote repositories é responsável por acessar o banco de dados, é comparada a camada DAO, é a mesma coisa.
//MESMA COISA QUE A CAMADA DAO
// CAMADA DE ACESSO AOS DADOS
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	
}
