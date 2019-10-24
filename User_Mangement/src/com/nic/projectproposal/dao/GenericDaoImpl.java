package com.nic.projectproposal.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;


/**
 * Basic DAO operations dependent with Hibernate's specific classes
 * @see SessionFactory
 */
@SuppressWarnings("unchecked")
@Repository
@Transactional
public abstract class GenericDaoImpl<E, K extends Serializable> implements GenericDao<E, K> {
   @Autowired
    private HibernateTemplate hibernateTemplate;

   

	protected Class<? extends E> daoType;

    /**
     * By defining this class as abstract, we prevent Spring from creating instance of this class
     * If not defined abstract getClass().getGenericSuperClass() would return Object.
     * There would be exception because Object class does not hava constructor with parameters.
     */
    public GenericDaoImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        daoType = (Class) pt.getActualTypeArguments()[0];
    }

   

    @Override
    public int add(E entity) {
       return (int)hibernateTemplate.save(entity);
    }

    @Override
    public void saveOrUpdate(E entity) {
    	hibernateTemplate.saveOrUpdate(entity);
    }

    @Override
    public void update(E entity) {
    	hibernateTemplate.saveOrUpdate(entity);
    }

    @Override
    public void remove(E entity) {
    	hibernateTemplate.delete(entity);
    }

    @Override
    public E find(K key) {
        return (E) hibernateTemplate.get(daoType, key);
    }

    
    
    @Override
    public List<E> getAll() {
    	
    	//Sstem.out.println("TEST"+daoType.toString());
        return hibernateTemplate.getSessionFactory().getCurrentSession().createCriteria(daoType).list();
    }
   
}