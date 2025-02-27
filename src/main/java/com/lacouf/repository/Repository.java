package com.lacouf.repository;

import com.lacouf.exception.DuplicateEntityException;

public interface Repository<T> {
    void save(T entity) throws DuplicateEntityException;
    T find(long id);
}
