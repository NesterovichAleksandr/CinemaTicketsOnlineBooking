package com.gmail.nesterovich.aleksandr.dao.impl;

import com.gmail.nesterovich.aleksandr.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;

//@Repository
//@Transactional
public class BaseDaoImpl<T extends Serializable, ID extends Serializable> implements BaseDao<T, ID> {

    //@Autowired
    private SessionFactory sessionFactory;

    private Class<T> entityClass;

   // @Autowired
    BaseDaoImpl(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public void save(T entity) {
        getSession().save(entity);
    }

    Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }
}
