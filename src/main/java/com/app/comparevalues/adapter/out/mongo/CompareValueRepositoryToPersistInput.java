package com.app.comparevalues.adapter.out.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.comparevalues.adapter.in.model.InputRequest;



public interface CompareValueRepositoryToPersistInput extends MongoRepository<InputRequest, Long> {

}
