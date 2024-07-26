package com.example.lxjdemo.response;

public class Properties {
    private int time;
    private String id;
    private String name;

    // 构造函数、getter和setter
    public Properties(int time, String id, String name) {
        this.time = time;
        this.id = id;
        this.name = name;
    }

    // Getter and Setter methods
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
