package com.meitheys.crudmongodb.mongoex.services;

import java.util.List;

import com.meitheys.crudmongodb.mongoex.documents.Cliente;

public interface ClienteService {
	
	List<Cliente> listarTodos();
	
	Cliente listarPorId(String id);
	
	Cliente cadastrar(Cliente cliente);
	
	Cliente atualizar(Cliente cliente);
	
	void remover(String id);

}
