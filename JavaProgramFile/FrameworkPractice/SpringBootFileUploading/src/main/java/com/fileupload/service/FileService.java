package com.fileupload.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	public String uploadImage(String path,MultipartFile file);

}