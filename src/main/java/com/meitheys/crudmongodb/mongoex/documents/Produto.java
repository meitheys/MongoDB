package com.meitheys.crudmongodb.mongoex.documents;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Document
public class Produto {

    @Id
    private String id;
    private String nomeProduto;
    private double preco;
    private long quantidade;

    public Produto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NotEmpty(message = "O produto deve conter um nome")
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    @NotNull(message = "O produto deve conter um preço")
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @NotNull(message = "Informe a quantidade do produto")
    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }
}


