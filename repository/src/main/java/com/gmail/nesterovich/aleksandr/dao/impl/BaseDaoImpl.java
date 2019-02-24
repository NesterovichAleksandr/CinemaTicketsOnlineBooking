package com.gmail.nesterovich.aleksandr.dao.impl;

import com.gmail.nesterovich.aleksandr.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@Repository
@Transactional
public class BaseDaoImpl<T extends Serializable, ID extends Serializable> implements BaseDao<T, ID> {

    @Autowired
    private SessionFactory sessionFactory;

    private Class<T> entityClass;

    @Autowired
    BaseDaoImpl(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public void save(T entity) {
        getSession().save(entity);
    }

    @Override
    public T findOne(String entityId) {
        return getSession().get(entityClass, entityId);
    }

    @Override
    public List findAll() {
        return getSession().createQuery("from " + entityClass.getSimpleName()).list();
    }

    @Override
    public void saveOrUpdate(T entity) {
        getSession().saveOrUpdate(entity);
    }

    @Override
    public void updateMerge(T entity) {
        getSession().merge(entity);
    }

    @Override
    public void delete(T entity) {
        getSession().delete(entity);
    }

    @Override
    public void deleteById(String entityId) {
        T entity = findOne(entityId);
        delete(entity);
    }

    Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }
}
