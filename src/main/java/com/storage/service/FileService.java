
package com.storage.service;

import java.io.IOException;
import java.util.Map;

import com.storage.dto.Files;
import com.storage.dto.FileUploadRequest;
import com.storage.dto.PagedListResponse;
import com.storage.dto.PaginationRequest;


/**
 * @author ankit
 */
public interface FileService {

	Map<String, Object> upload(FileUploadRequest fileUploadRequest) throws IOException;
    
    PagedListResponse<Files> getFilesByParams(PaginationRequest request);
    
}
