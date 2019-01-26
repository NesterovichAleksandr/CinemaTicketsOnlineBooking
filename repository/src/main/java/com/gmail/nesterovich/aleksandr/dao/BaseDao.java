package com.gmail.nesterovich.aleksandr.dao;

import java.io.Serializable;

public interface BaseDao<T extends Serializable, ID extends Serializable> {

    void save(T entity);
}
