package by.teachmeskills.inheritance.taskFirstFigure;

public class Triangle extends Figure {
    private String name;
    private double sideA; //основание
    private double sideB;
    private double sideC;
    private double height;
    private double square;
    private double perimetr;

    public Triangle(String name, double sideA, double sideB, double sideC, double height) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void countSquare() {
        square = (sideA * height)/2;
        System.out.println("Площадь " + name + " равна " + square);
    }

    @Override
    public void countPerimetr() {
        perimetr = sideA + sideB + sideC;
        System.out.println("Периметр " + name + " равен " + perimetr);
    }
}
