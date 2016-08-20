package io.khasang.cs.dao.impl;

import io.khasang.cs.dao.BaseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class BaseDaoImpl<T> implements BaseDao<T> {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Session session() {
		return sessionFactory.getCurrentSession();
	}

	protected abstract String getEntityName();

	@Override
	public void save(final T entity) {
		session().saveOrUpdate(entity);
	}

	@Override
	public void delete(final T entity) {
		session().delete(entity);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return session().createQuery("FROM " + getEntityName()).list();
	}

	@Override
	@SuppressWarnings("unchecked")
	public T findById(final Long id) {
		return (T) session().createQuery("FROM " + getEntityName() + " where id = :id").setParameter("id", id)
				.uniqueResult();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<T> findByIds(final Collection<Long> ids) {
		if (ids == null || ids.isEmpty())
			return Collections.emptyList();

		final Query query = session().createQuery("FROM " + getEntityName() + " where id in (:ids)");
		query.setParameterList("ids", ids);
		return query.list();
	}

	protected Query getCacheableQuery(String query) {
		return session().createQuery(query).setCacheable(true);
	}

}
