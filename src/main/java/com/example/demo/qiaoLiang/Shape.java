package com.example.demo.qiaoLiang;

public abstract class Shape {

    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}

