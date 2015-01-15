package com.storage.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FILES")
public class Files implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="filekey")
	private Long id;
	@Column(name="name")
    private String title;
	@Column(name="filesize")
    private Long sizeInBytes;
	@Column(name="status")
    private String status;
	@Column(name="description")
    private String description;
	@Column(name="previewUrl")
    private String previewUrl;
	@Column(name="uploadedTo")
    private String uploadedTo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getSizeInBytes() {
		return sizeInBytes;
	}
	public void setSizeInBytes(Long sizeInBytes) {
		this.sizeInBytes = sizeInBytes;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPreviewUrl() {
		return previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}
	public String getUploadedTo() {
		return uploadedTo;
	}
	public void setUploadedTo(String uploadedTo) {
		this.uploadedTo = uploadedTo;
	}

}
