package com.example.lxjdemo.response;

import lombok.Data;

@Data
public class MapCoordinate {
    private double latitude;
    private double longitude;

    public MapCoordinate(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}