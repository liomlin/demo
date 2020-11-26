package com.example.demo.qiaoLiang;

public class Circle extends Shape{
    private int radius;
    public Circle(int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        }
    @Override
    public void draw() {
        drawAPI.draw(radius, 0, 0);

    }
}
