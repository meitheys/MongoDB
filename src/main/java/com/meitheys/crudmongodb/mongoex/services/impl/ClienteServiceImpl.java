package com.meitheys.crudmongodb.mongoex.services.impl;

import java.util.List;

import com.meitheys.crudmongodb.mongoex.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meitheys.crudmongodb.mongoex.documents.Cliente;
import com.meitheys.crudmongodb.mongoex.repositories.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRespository;

	@Override
	public List<Cliente> listarTodos() {
		return this.clienteRespository.findAll();
	}

	@Override
	public Cliente listarPorId(String id) {
		return this.clienteRespository.findOne(id);
	}

	@Override
	public Cliente cadastrar(Cliente cliente) {
		return this.clienteRespository.save(cliente);
	}

	@Override
	public Cliente atualizar(Cliente cliente) {
		return this.clienteRespository.save(cliente);
	}

	@Override
	public void remover(String id) {
		this.clienteRespository.delete(id);
	}

}
