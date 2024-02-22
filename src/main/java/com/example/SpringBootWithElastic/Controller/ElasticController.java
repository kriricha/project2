package com.example.SpringBootWithElastic.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootWithElastic.model.Elastic;
import com.example.SpringBootWithElastic.repo.ElasticRepository;

@RestController
@RequestMapping("/api/employees")
public class ElasticController {
    @Autowired
    private ElasticRepository repository;
    @PostMapping
    
    public Elastic create(@RequestBody Elastic employee) {
        return repository.save(employee);
    }
    @GetMapping("/{id}")
    public Optional<Elastic> findById(@PathVariable String id) {
        return repository.findById(id);
    }

    @GetMapping
    public Iterable<Elastic> findAll() {
        return repository.findAll();
    }
}