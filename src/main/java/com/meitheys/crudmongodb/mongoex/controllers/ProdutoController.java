package com.meitheys.crudmongodb.mongoex.controllers;

import com.meitheys.crudmongodb.mongoex.documents.Produto;
import com.meitheys.crudmongodb.mongoex.responses.Response;
import com.meitheys.crudmongodb.mongoex.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<Response<List<Produto>>> listarTodos() {
        return ResponseEntity.ok(new Response<List<Produto>>(this.produtoService.listarTodos()));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Response<Produto>> listarPorId(@PathVariable(name = "id") String id) {
        return ResponseEntity.ok(new Response<Produto>(this.produtoService.listarPorId(id)));
    }

    @PostMapping
    public ResponseEntity<Response<Produto>> cadastrar(@Valid @RequestBody Produto produto, BindingResult result) {
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Produto>(erros));
        }
        return ResponseEntity.ok(new Response<Produto>(this.produtoService.cadastrar(produto)));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Response<Produto>> atualizar(@PathVariable(name = "id") String id, @Valid @RequestBody Produto produto, BindingResult result) {
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Produto>(erros));
        }
        produto.setId(id);
        return ResponseEntity.ok(new Response<Produto>(this.produtoService.atualizar(produto)));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id) {
        this.produtoService.remover(id);
        return ResponseEntity.ok(new Response<Integer>(1));
    }
}
