package com.example.repository;

import com.example.entity.Author;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Transactional
@Repository
public abstract class AuthorRepository extends AbstractRepository<Author> implements CrudRepository<Author, Long> {

    public AuthorRepository(EntityManager entityManager) {
        super(entityManager);
    }
}
