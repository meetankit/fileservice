package com.storage.dto;

import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadRequestBuilder {
	private MultipartFile file;
	private String provider;

	public FileUploadRequestBuilder() {
		file = new MockMultipartFile("test.mov", "test.mov", null, "Hello world".getBytes());
		provider = "YOUTUBE";
	}

	public FileUploadRequest build() {
		FileUploadRequest fileUploadRequest = new FileUploadRequest();
		fileUploadRequest.setContentType("Text");
		fileUploadRequest.setDescription("test description");
		fileUploadRequest.setFile(file);
		fileUploadRequest.setFileUrl("http://test");
		fileUploadRequest.setProvider(provider);
		return fileUploadRequest;
	}
}
