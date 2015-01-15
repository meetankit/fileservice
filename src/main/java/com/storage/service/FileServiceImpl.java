package com.storage.service;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.storage.dao.FileDao;
import com.storage.dto.FileUploadRequest;
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
	    fileService.getFilesByParams(null);
	    ctx.close();
	}

	@Override
	public Map<String, Object> upload(FileUploadRequest fileUploadRequest)
			throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PagedListResponse<Files> getFilesByParams(PaginationRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
