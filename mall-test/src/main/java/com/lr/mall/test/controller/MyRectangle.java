package com.lr.mall.test.controller;

/**
 * @author liurui
 * @date 2021/1/23 10:44
 */

public class MyRectangle extends GeometricObject {
    private double width;
    private double height;
    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double findArea() {
        // TODO Auto-generated method stub
        return width * height;
    }
}


