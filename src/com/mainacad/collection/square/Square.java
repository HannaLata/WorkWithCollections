package com.mainacad.collection.square;

import com.mainacad.collection.abs.AbstractShape;

public class Square extends AbstractShape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    public String toString() {
        return String.valueOf(side*side);
    }

}
