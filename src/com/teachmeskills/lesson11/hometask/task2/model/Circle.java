package com.teachmeskills.lesson11.hometask.task2.model;

public final class Circle extends Figure {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * r);
    }
}
