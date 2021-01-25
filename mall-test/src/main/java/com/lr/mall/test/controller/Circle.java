package com.lr.mall.test.controller;

/**
 * @author liurui
 * @date 2021/1/23 10:45
 */
public class Circle extends GeometricObject {
    private double radius;
    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea() {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle circle = null;
        if (circle != null) {
            circle.getRadius();

        }
    }
}