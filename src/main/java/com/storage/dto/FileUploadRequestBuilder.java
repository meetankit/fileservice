package com.storage.dto;

import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadRequestBuilder {
	private MultipartFile file;

	public FileUploadRequestBuilder() {
		file = new MockMultipartFile("test.mov", "test.mov", null, "Hello world".getBytes());
	}

	public FileUploadRequest build() {
		FileUploadRequest fileUploadRequest = new FileUploadRequest();
		fileUploadRequest.setContentType(ContentType.TEXT);
		fileUploadRequest.setDescription("test description");
		fileUploadRequest.setFile(file);
		fileUploadRequest.setFileUrl("http://test");
		fileUploadRequest.setProvider(Provider.YOUTUBE);
		return fileUploadRequest;
	}
}
