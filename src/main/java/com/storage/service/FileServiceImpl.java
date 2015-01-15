package com.storage.service;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.storage.dao.FileDao;
import com.storage.dto.CreateFileRequest;
import com.storage.dto.FileDto;
import com.storage.dto.FileUploadRequest;
import com.storage.dto.PagedListResponse;
import com.storage.dto.PaginationRequest;

public class FileServiceImpl implements FileService {
	
	@Autowired
	private FileDao fileDao;

	public static void main(String[] args) {
		
	}

	@Override
	public Map<String, Object> upload(FileUploadRequest fileUploadRequest)
			throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PagedListResponse<FileDto> getFilesByParams(PaginationRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> createFile(CreateFileRequest file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> updateFile(MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
	}
}
