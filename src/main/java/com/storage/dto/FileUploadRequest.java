
package com.storage.dto;

import org.springframework.web.multipart.MultipartFile;

/**
 * File upload request by the client
 * @author ankit
 */
public class FileUploadRequest {
	
	private MultipartFile file;
	private String provider;
	private String description;
	private String contentType;
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	
	
}