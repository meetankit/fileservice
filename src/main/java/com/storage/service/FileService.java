
package com.storage.service;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.storage.dto.CreateFileRequest;
import com.storage.dto.FileDto;
import com.storage.dto.FileUploadRequest;
import com.storage.dto.PagedListResponse;
import com.storage.dto.PaginationRequest;


/**
 * @author ankit
 */
public interface FileService {

	Map<String, Object> upload(FileUploadRequest fileUploadRequest) throws IOException;
    
    PagedListResponse<FileDto> getFilesByParams(PaginationRequest request);
    
    Map<String, Object> createFile(CreateFileRequest file);
    
    Map<String, Object> updateFile(MultipartFile file);

}
