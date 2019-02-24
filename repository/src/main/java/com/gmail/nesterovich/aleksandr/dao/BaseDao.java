package com.gmail.nesterovich.aleksandr.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T extends Serializable, ID extends Serializable> {

    void save(T entity);

    T findOne(final String entityId);

    List<T> findAll();

    void saveOrUpdate(final T entity);

    void updateMerge(T entity);

    void delete(final T entity);

    void deleteById(final String entityId);
}
