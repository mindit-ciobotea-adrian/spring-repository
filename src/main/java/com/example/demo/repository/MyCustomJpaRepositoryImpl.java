package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class MyCustomJpaRepositoryImpl<T, ID> implements MyCustomJpaRepository<T, ID> {
    @PersistenceContext
    private EntityManager entityManager;
    private ResolvableType resolvableType;

    public MyCustomJpaRepositoryImpl() {
        this.resolvableType = ResolvableType.forClass(MyCustomJpaRepositoryImpl.class).as(MyCustomJpaRepository.class);;
    }

    @Override
    public List<T> findAll() {
        //Query query = entityManager.createNativeQuery(String.format("select * from %s", this.type.getClass().getName().toLowerCase()));
        //return query.getResultList();
return null;
    }

    @Override
    public List<T> findAllById(ID id) {
        //Query query = entityManager.createNativeQuery(String.format("select * from %s where id=%s", this.type.getClass().getName().toLowerCase(), id));
        //return query.getResultList();
        return null;
    }

    @Override
    public void save(T entity) {
        entityManager.persist(entity);
    }

    public void delete(ID id) {
        //Query query = entityManager.createNativeQuery(String.format("delete from %s where id=%s", this.type.getClass().getName().toLowerCase(), id));
        //query.executeUpdate();

    }
}
