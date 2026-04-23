package com.StudentDatabase.studentDatabase.dao;


import com.StudentDatabase.studentDatabase.entity.Data;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class studentDatabaseDAOImpl implements studentDatabaseDAO {

    private EntityManager em;

    @Autowired
    public studentDatabaseDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional
    public void save(Data data) {
        em.persist(data);
    }

    @Override
    public Data findById(int id) {
        return em.find(Data.class, id);
    }

    @Override
    public List<Data> findAll() {
        return em.createQuery("FROM Data", Data.class).getResultList();
    }

    @Override
    @Transactional
    public void update(Data data) {
        em.merge(data);
    }


}
