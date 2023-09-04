package com.teachmeskills.lesson11.hometask.task2.model;

public sealed abstract class Figure permits Circle, Rectangle, Triangle {
    public abstract double getArea();

    public abstract int getPerimeter();
}
