package com.mainacad.collection;

import java.util.ArrayList;
import java.util.List;

import com.mainacad.collection.abs.Shape;
import com.mainacad.collection.circle.Circle;
import com.mainacad.collection.square.Square;
import com.mainacad.collection.triangle.Triangle;

public class ApplicationRunner {


    public static void main(String[] args) {

        Triangle triangle1 = new Triangle();
        triangle1.setSide(17);
        triangle1.setHeight(29);
        Triangle triangle2 = new Triangle();
        triangle2.setSide(5);
        triangle2.setHeight(7);
        Triangle triangle3 = new Triangle();
        triangle3.setSide(11);
        triangle3.setHeight(13);
        Circle circle1 = new Circle();
        circle1.setRadius(16);
        Circle circle2 = new Circle();
        circle2.setRadius(13);
        Circle circle3 = new Circle();
        circle3.setRadius(9);
        Square square1 = new Square();
        square1.setSide(7);
        Square square2 = new Square();
        square2.setSide(19);
        Square square3 = new Square();
        square3.setSide(41);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(square1);
        shapes.add(square2);
        shapes.add(square3);
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(circle3);
        shapes.add(triangle1);
        shapes.add(triangle2);
        shapes.add(triangle3);

        Shape maxShape = null, minShape = null;

        if (!shapes.isEmpty()) {
            maxShape = shapes.get(0);
            minShape= shapes.get(0);
        }

        for (int i = 1; i < shapes.size(); i++) {
            if (maxShape.getArea() < shapes.get(i).getArea()) {
                maxShape = shapes.get(i);
            }

            if (minShape.getArea() > shapes.get(i).getArea()) {
                minShape = shapes.get(i);
            }

        }

        System.out.println ("Фигура с минимальной площадью - " + minShape.getClass().getSimpleName() +
                " и ее площадь равна - " + minShape.toString() + " , а фигура с максимальной площадью - "
                + maxShape.getClass().getSimpleName() + " и ее площадь равна - " + maxShape.toString() + ".");

    } }
