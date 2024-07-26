package com.example.lxjdemo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Geometry {
    private String type;

    @JsonProperty("coordinates")
    private double[] coordinates;

    // 构造函数、getter和setter
    public Geometry(String type, double[] coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    // Getter and Setter methods
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }
}
