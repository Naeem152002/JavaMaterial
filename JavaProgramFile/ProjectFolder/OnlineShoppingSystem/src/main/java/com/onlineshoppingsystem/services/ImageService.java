package com.onlineshoppingsystem.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.onlineshoppingsystem.dto.Response;

public interface ImageService {
	Response saveImages(Long productId, List<MultipartFile> files);
    Response updateImage(MultipartFile file,  Long imageId);
    Response getImageById(Long id);
    Response deleteImageById(Long id);
    
}
