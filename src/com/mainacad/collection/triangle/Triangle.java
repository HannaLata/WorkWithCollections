package com.mainacad.collection.triangle;

import com.mainacad.collection.abs.AbstractShape;

public class Triangle extends AbstractShape {

    private double side;
    private double height;

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (side*height)/2;
    }

    public String toString() {
        return String.valueOf((side*height)/2);
    }

}

