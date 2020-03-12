package com.meitheys.crudmongodb.mongoex.repositories;

import com.meitheys.crudmongodb.mongoex.documents.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
}
