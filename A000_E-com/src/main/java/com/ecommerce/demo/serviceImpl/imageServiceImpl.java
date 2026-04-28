package com.ecommerce.demo.serviceImpl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ecommerce.demo.service.ImageService;

@Service
public class imageServiceImpl implements ImageService {

	@Override
	public String uploadImage(String path, MultipartFile file) {
		// TODO Auto-generated method stub
		String filename=file.getOriginalFilename();
		
	
		try {
			File f=new File(path);
			if(!f.exists()) {
				
				f.mkdir();
			}
			
			String filepath=path+File.separator+filename;
			Files.copy( file.getInputStream(), Paths.get(filepath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filename;
	}

	
}
