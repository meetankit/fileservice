package com.storage.dao;

import java.util.Collection;
import java.util.Map;

import com.storage.dto.Files;

public interface FileDao {

    Files createOrUpdate(Files hostedFile);

    Files findById(long fileKey);

    Collection<Files> findByParameters(Map<String, Object> parameters);

}
