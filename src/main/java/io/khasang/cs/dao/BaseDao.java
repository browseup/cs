package io.khasang.cs.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.Collection;
import java.util.List;

public interface BaseDao<T> {

	Session session();

	void save(T entity);

	void delete(T entity);

	List<T> findAll();

	T findById(Long id);

	List<T> findByIds(Collection<Long> ids);

}
