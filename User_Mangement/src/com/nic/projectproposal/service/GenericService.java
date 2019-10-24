package com.nic.projectproposal.service;

import java.util.List;

/**
 * Generic Service
 */
public interface GenericService<E, K> {
    public void saveOrUpdate(E entity);

   
    public List<E> getAll();

    public E get(K id);

    public int add(E entity);

    public void update(E entity);

    public void remove(E entity);
}
