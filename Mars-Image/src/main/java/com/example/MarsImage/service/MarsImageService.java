package com.example.MarsImage.service;

import com.example.MarsImage.model.MarsRoverImages;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarsImageService {
    public MarsRoverImages getService(String roverType){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<MarsRoverImages> response =restTemplate.getForEntity(
                "https://api.nasa.gov/mars-photos/api/v1/rovers/"+roverType+"/photos?sol=1000&api_key=DEMO_KEY",
                MarsRoverImages.class);
        return response.getBody();
    }
}
