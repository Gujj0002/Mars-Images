package com.example.MarsImage.web;

import com.example.MarsImage.model.MarsRoverImages;
import com.example.MarsImage.service.MarsImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private MarsImageService marsImageService;

    @GetMapping("/mars")
    public String getView(ModelMap model){
        MarsRoverImages images = marsImageService.getService();
        model.put("images", images);
        return "index";
    }
}
