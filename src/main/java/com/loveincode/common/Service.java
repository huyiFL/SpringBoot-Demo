package com.loveincode.common;

import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;

import tk.mybatis.mapper.entity.Condition;

/**
 * Service layer base interface, other Service interfaces please inherit this
 * interface
 */
public interface Service<T> {
	void save(T model);// persistence
	void save(List<T> models);// Batch persistence
	void deleteById(Integer id);// Delete by primary key
	void deleteByIds(String ids);// Batch delete eg：ids -> “1,2,3,4”
	void update(T model);// update
	T findById(Integer id);// Find out by ID
	T findBy(String fieldName, Object value) throws TooManyResultsException;
	List<T> findByIds(String ids);// Find by multiple ids//eg：ids -> “1,2,3,4”
	List<T> findByCondition(Condition condition);// Look up
	List<T> findAll();// get all
}
