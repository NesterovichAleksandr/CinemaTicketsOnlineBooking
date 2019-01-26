package com.gmail.nesterovich.aleksandr.dao.impl;

import com.gmail.nesterovich.aleksandr.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;

import javax.transaction.Transactional;
import java.io.Serializable;

@Repository
@Transactional
public class BaseDaoImpl<T extends Serializable, ID extends Serializable> implements BaseDao<T, ID> {

    @Autowired
    private SessionFactory sessionFactory;

    private Class<T> entityClass;

    BaseDaoImpl(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    //@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
    public void save(T entity) {
        getSession().saveOrUpdate(entity);
    }

    Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }
}
