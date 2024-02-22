package com.example.SpringBootWithElastic.repo;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.SpringBootWithElastic.model.Elastic;
public interface ElasticRepository extends ElasticsearchRepository<Elastic, String> {
}