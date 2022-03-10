package com.example.repository;

import lombok.RequiredArgsConstructor;
import javax.persistence.EntityManager;
import java.util.List;

@RequiredArgsConstructor
public class AbstractRepository<T> {

    private final EntityManager entityManager;

    public List<T> findCustom() {
        List list = entityManager.createQuery("SELECT a FROM Author a ORDER BY a.id DESC")
                .getResultList();
        return list;
    }
}
