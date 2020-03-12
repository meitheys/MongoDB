package com.meitheys.crudmongodb.mongoex.services;

import com.meitheys.crudmongodb.mongoex.documents.Produto;

import java.util.List;

public interface ProdutoService {

    Produto cadastrar(Produto produto);

    Produto atualizar(Produto produto);

    void remover(String id);

    Produto listarPorId(String id);

    List<Produto> listarTodos();
}