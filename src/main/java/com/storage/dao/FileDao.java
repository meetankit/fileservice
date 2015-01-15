package com.storage.dao;

import java.util.Collection;
import java.util.Map;

import com.storage.dto.Files;

public interface FileDao {

    Files createOrUpdate(Files file);

    Collection<Files> findByParameters(Map<String, Object> parameters);

}
