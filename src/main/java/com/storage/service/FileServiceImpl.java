package com.storage.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.storage.dao.FileDao;
import com.storage.dto.FileStatus;
import com.storage.dto.FileUploadRequest;
import com.storage.dto.FileUploadRequestBuilder;
import com.storage.dto.Files;
import com.storage.dto.PagedListResponse;
import com.storage.dto.PaginationRequest;

@Service
public class FileServiceImpl implements FileService {
	
	@Autowired
	private FileDao fileDao;

	public static void main(String[] args) {
	    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	    FileService fileService = ctx.getBean(FileService.class);
	    fileService.upload(new FileUploadRequestBuilder().build());
	    ctx.close();
	}

	@Override
	public Map<String, Object> upload(FileUploadRequest fileUploadRequest) {
		Files file = new Files();
		file.setCreateDate(System.currentTimeMillis());
		file.setDescription(fileUploadRequest.getDescription());
		file.setPreviewUrl(fileUploadRequest.getFileUrl());
		if(fileUploadRequest.getFile() != null) {
			file.setSizeInBytes(fileUploadRequest.getFile().getSize());
			file.setTitle(fileUploadRequest.getFile().getOriginalFilename());
		}
		file.setStatus(FileStatus.UPLOAD_COMPLETE.name());
		file.setUploadedTo(fileUploadRequest.getProvider().name());
		file = fileDao.createOrUpdate(file);
		Map<String, Object> files = new HashMap<String, Object>();
		files.put("fileKey", file.getId());
		return files;
	}

	@Override
	public PagedListResponse<Files> getFilesByParams(PaginationRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
