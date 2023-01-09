package by.teachmeskills.inheritance.taskFirstFigure;

import static java.lang.Math.PI;

public class Rectangle extends Figure{
    private String name;
    private double sideA;
    private double sideB;
    private double square;
    private double perimetr;

    public Rectangle(String name, double sideA, double sideB) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public String getName() {
        return name;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public void countSquare() {
        square = sideA * sideB;
        System.out.println("Площадь " + name + " равна " + square);
    }

    @Override
    public void countPerimetr() {
        perimetr = 2 * (sideA * sideB);
        System.out.println("Периметр " + name + " равен " + perimetr);
    }
}
