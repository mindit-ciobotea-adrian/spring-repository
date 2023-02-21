package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyCustomJpaRepository<T, ID> {
    List<T> findAll();

    List<T> findAllById(ID id);

    void save(T entity);

    void delete(ID id);
}
