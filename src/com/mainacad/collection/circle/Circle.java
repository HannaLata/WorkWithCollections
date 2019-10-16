package com.mainacad.collection.circle;

import com.mainacad.collection.abs.AbstractShape;

public class Circle extends AbstractShape {

    private double radius;

    public double getRadius () {
        return radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea () {
        return radius*radius*Math.PI;
    }

    public String toString() {
        return String.valueOf(Math.PI*radius*radius);
    }


}
