package com.fileupload.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fileupload.response.FileResponse;
import com.fileupload.service.FileService;

@RestController
public class FileController {
	
	@Autowired
	private FileService fileService;
	
	@Value("${project.image}")
	private String path;
	
	
	@PostMapping("/upload")
	public ResponseEntity<FileResponse>uploadImage(@RequestParam MultipartFile image){
		String fileName=null;
		try {
		fileName=fileService.uploadImage(path, image);
		}catch(Exception e) {
			return new ResponseEntity<>(new FileResponse(null,"file does not upload due to server error"),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		return new ResponseEntity<>(new FileResponse(fileName,"Successfully Uploaded"),HttpStatus.OK);
	}

}
