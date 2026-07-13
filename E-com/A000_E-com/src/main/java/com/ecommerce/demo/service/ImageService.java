package com.ecommerce.demo.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

	public String uploadImage(String path,MultipartFile file);
}
