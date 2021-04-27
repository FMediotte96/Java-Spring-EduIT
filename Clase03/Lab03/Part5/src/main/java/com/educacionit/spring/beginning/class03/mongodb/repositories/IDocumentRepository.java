

package com.educacionit.spring.beginning.class03.mongodb.repositories;


import com.educacionit.spring.beginning.class03.mongodb.entities.Document;
import org.springframework.stereotype.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
public interface IDocumentRepository extends MongoRepository<Document, String> {
}