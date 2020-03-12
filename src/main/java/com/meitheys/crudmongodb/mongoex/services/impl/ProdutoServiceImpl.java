package com.meitheys.crudmongodb.mongoex.services.impl;

import com.meitheys.crudmongodb.mongoex.documents.Produto;
import com.meitheys.crudmongodb.mongoex.repositories.ProdutoRepository;
import com.meitheys.crudmongodb.mongoex.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public Produto cadastrar(Produto produto) {
        return this.produtoRepository.save(produto);
    }

    @Override
    public Produto atualizar(Produto produto) {
        return this.produtoRepository.save(produto);
    }

    @Override
    public void remover(String id) {
        this.produtoRepository.delete(id);
    }

    @Override
    public Produto listarPorId(String id) {
        return this.produtoRepository.findOne(id);
    }

    @Override
    public List<Produto> listarTodos() {
            return this.produtoRepository.findAll();
    }
}