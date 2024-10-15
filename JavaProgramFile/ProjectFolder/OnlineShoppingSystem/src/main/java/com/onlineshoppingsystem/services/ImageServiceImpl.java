//package com.onlineshoppingsystem.services;
//
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.sql.rowset.serial.SerialBlob;
//
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.onlineshoppingsystem.dto.ImageDto;
//import com.onlineshoppingsystem.dto.Response;
//import com.onlineshoppingsystem.exceptions.ResourceNotFoundException;
//import com.onlineshoppingsystem.model.Image;
//import com.onlineshoppingsystem.model.Product;
//import com.onlineshoppingsystem.repository.ImageRepository;
//import com.onlineshoppingsystem.services.ProductService;
//
//import lombok.RequiredArgsConstructor;
//
//@Service
//@RequiredArgsConstructor
//public class ImageServiceImpl implements ImageService {
//    private final ImageRepository imageRepository;
//    private final ProductService productService;
//
//
//    @Override
//    public Response getImageById(Long id) {
//        return imageRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("No image found with id: ",null,0 + id));
//    }
//
//    @Override
//    public Response deleteImageById(Long id) {
//        imageRepository.findById(id).ifPresentOrElse(imageRepository::delete, () -> {
//            throw new ResourceNotFoundException("No image found with id: ",null,0 + id);
//        });
//
//    }
//
//    @Override
//    public Response saveImages( Long productId,   List<MultipartFile> files) {
//        Response response = productService.getProductById(productId);
//
//        List<ImageDto> savedImageDto = new ArrayList<>();
//        for (MultipartFile file : files) {
//            try {
//                Image image = new Image();
//                image.setFileName(file.getOriginalFilename());
//                image.setFileType(file.getContentType());
//                image.setImage(new SerialBlob(file.getBytes()));
//                //image.setProduct(response);
//
//                String buildDownloadUrl = "/api/v1/images/image/download/";
//                String downloadUrl = buildDownloadUrl+image.getId();
//                image.setDownloadUrl(downloadUrl);
//               Image savedImage = imageRepository.save(image);
//
//               savedImage.setDownloadUrl(buildDownloadUrl+savedImage.getId());
//               imageRepository.save(savedImage);
//
//               ImageDto imageDto = new ImageDto();
//               imageDto.setId(savedImage.getId());
//               imageDto.setFileName(savedImage.getFileName());
//               imageDto.setDownloadUrl(savedImage.getDownloadUrl());
//               savedImageDto.add(imageDto);
//
//            }   catch(IOException | SQLException e){
//                throw new RuntimeException(e.getMessage());
//            }
//        }
//        return savedImageDto;
//    }
//
//    
//
//    @Override
//    public Response updateImage(MultipartFile file, Long imageId) {
//        Image image = getImageById(imageId);
//        try {
//            image.setFileName(file.getOriginalFilename());
//            image.setFileType(file.getContentType());
//            image.setImage(new SerialBlob(file.getBytes()));
//            imageRepository.save(image);
//        } catch (IOException | SQLException e) {
//            throw new RuntimeException(e.getMessage());
//        }
//
//    }
//}
