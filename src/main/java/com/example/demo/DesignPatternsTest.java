package com.example.demo;

import com.example.demo.qiaoLiang.*;
import com.example.demo.test.User;

public class DesignPatternsTest {
    public static void main(String[] args) {
        /*User build = User.builder()
                .name("test")
                .gender("nv")
                .age(1)
                .height(175)
                .build();*/


        Shape greenCircle = new Circle(10, new GreenPen());
        Shape redRectangle = new Rectangle(4, 8, new RedPen());
        greenCircle.draw();
        redRectangle.draw();
    }
}
