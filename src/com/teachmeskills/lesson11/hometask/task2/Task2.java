package com.teachmeskills.lesson11.hometask.task2;

import com.teachmeskills.lesson11.hometask.task2.model.Circle;
import com.teachmeskills.lesson11.hometask.task2.model.Figure;
import com.teachmeskills.lesson11.hometask.task2.model.Rectangle;
import com.teachmeskills.lesson11.hometask.task2.model.Triangle;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Circle(2));
        figures.add(new Rectangle(2, 4));
        figures.add(new Rectangle(3, 5));
        figures.add(new Triangle(1, 2, 3));
        figures.add(new Triangle(3, 4, 5));
        for (Figure figure : figures) {
            System.out.println("Perimeter of " + figure.getClass().getSimpleName() + " is: " + figure.getPerimeter());
        }
    }
}
