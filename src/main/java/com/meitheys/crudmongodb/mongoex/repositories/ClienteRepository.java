package com.meitheys.crudmongodb.mongoex.repositories;

import com.meitheys.crudmongodb.mongoex.documents.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
    Optional<Cliente> findById(String id)                                                                                                                                              ;

}
