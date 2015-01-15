package com.storage.dao;

import java.util.Collection;
import java.util.Map;

import com.storage.dto.FileDto;

public interface FileDao {

    FileDto createOrUpdate(FileDto hostedFile);

    FileDto findById(long fileKey);

    Collection<FileDto> findByParameters(Map<String, Object> parameters);

}
