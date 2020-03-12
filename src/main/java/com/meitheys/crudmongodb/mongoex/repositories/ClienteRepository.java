package com.meitheys.crudmongodb.mongoex.repositories;

import com.meitheys.crudmongodb.mongoex.documents.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
