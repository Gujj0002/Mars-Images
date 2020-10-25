package com.example.MarsImage.model;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverImages {

    List<MarsPhoto> photos = new ArrayList<>();

    public List<MarsPhoto> getPhotos() {
        return photos;
    }

    public void setPhotos(List<MarsPhoto> photos) {
        this.photos = photos;
    }

    @Override
    public String toString() {
        return "MarsRoverImages{" +
                "photos=" + photos +
                '}';
    }
}
