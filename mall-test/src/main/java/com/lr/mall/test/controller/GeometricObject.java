package com.lr.mall.test.controller;

/**
 * @author liurui
 * @date 2021/1/23 10:46
 */
public abstract class GeometricObject {
    protected String color;
    protected double weight;
    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract double findArea();
}

