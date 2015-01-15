package com.storage.dao;

import java.util.Collection;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.storage.dto.Files;

public class FileDaoImpl extends HibernateDaoSupport implements FileDao {

	@Override
	@Transactional
	public Files createOrUpdate(Files file) {
        getHibernateTemplate().saveOrUpdate(file);
        return file;
	}

	@Override
	public Collection<Files> findByParameters(Map<String, Object> parameters) {
		// TODO Auto-generated method stub
		return null;
	}

}
