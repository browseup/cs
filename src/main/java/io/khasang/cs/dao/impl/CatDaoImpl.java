package io.khasang.cs.dao.impl;


import io.khasang.cs.entity.Cat;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by alexey_n on 20.08.2016.
 */
@Repository
@Transactional
public class CatDaoImpl implements CatDao {
    @Autowired
    SessionFactory sessionFactory;

    public CatDaoImpl() {
    }

    @Override
    public Cat getCatById(int id) {
        Criteria criteria = sessionFactory.
                getCurrentSession().
                createCriteria(Cat.class);
        criteria.add(Restrictions.eq("id", id));
        return (Cat) criteria.uniqueResult();
    }

}
