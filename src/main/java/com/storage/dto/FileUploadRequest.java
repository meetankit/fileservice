
package com.storage.dto;

import org.springframework.web.multipart.MultipartFile;

/**
 * File upload request by the client
 * @author ankit
 */
public class FileUploadRequest {
	
	private MultipartFile file;
	private Provider provider;
	private String description;
	private ContentType contentType;
	private String fileUrl;
	
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ContentType getContentType() {
		return contentType;
	}
	public void setContentType(ContentType contentType) {
		this.contentType = contentType;
	}
	
	
}