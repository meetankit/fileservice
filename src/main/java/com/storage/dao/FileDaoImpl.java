package com.storage.dao;

import java.util.Collection;
import java.util.Map;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.storage.dto.Files;

public class FileDaoImpl extends HibernateDaoSupport implements FileDao {

	@Override
	@Transactional(readOnly = false)
	public Files createOrUpdate(Files file) {
		if(file.getId() == null || file.getId() == 0L) {
			file.setId(UniqueIdGenerator.generate(0));
		}
        getHibernateTemplate().saveOrUpdate(file);
        return file;
	}


	@Override
	public Collection<Files> findByParameters(Map<String, Object> parameters) {
		// TODO Auto-generated method stub
		return null;
	}

}
