package com.app.comparevalues.adapter.out.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.comparevalues.adapter.out.model.view.OutPutResponseVM;



public interface CompareValueRepositoryToPersistOutput extends MongoRepository<OutPutResponseVM, Long>{

}
