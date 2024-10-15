package com.restapi.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.web.multipart.MultipartFile;

public class Test {
	
	public String uploadImage(String path,MultipartFile file) {
		String name=file.getOriginalFilename();
		
		String fullPath=path+File.separator+name;
		
		
		File f=new File(fullPath);
		
		if(!f.exists()) {
			f.mkdir();
		}
		
		
		try {
			Files.copy(file.getInputStream(), Paths.get(fullPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return name;
	}

}
