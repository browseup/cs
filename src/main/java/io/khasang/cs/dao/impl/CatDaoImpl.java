package io.khasang.cs.dao.impl;

import io.khasang.cs.dao.CatDao;
import io.khasang.cs.entity.Cat;
import org.hibernate.Session;
import org.osgi.service.component.annotations.Component;

import java.util.Collection;
import java.util.List;

/**
 * Created by alexey_n on 20.08.2016.
 */
public class CatDaoImpl extends BaseDaoImpl<Cat> implements CatDao{

    @Override
    protected String getEntityName() {
        return null;
    }
}
