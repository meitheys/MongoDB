package com.meitheys.crudmongodb.mongoex.repositories;

import com.meitheys.crudmongodb.mongoex.documents.Cliente;
import com.meitheys.crudmongodb.mongoex.services.ClienteService;

import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@DataJpaTest
@Ignore("*")
public class ClienteRepositoryTest {

    //TODO 13/03/2020 FINISH IT

    static final String SUCESSO = "Sucesso";
    static final String PROBLEMA = "Problema";

    @Autowired
    TestEntityManager entityManager;

    @Autowired
    private ClienteRepository clienteRepository;

    @Mock
    private ClienteService clienteService;

    @InjectMocks
    private Cliente cliente;

    @Test
    public void testRepository(){
        Cliente cliente = new Cliente();
        cliente.setNome("Unit Test User");
        cliente.setCpf("09498437677");
        cliente.setEmail("ghfggjh@gddafgd.com.br");
        cliente = entityManager.persistAndFlush(cliente);
    }
}
