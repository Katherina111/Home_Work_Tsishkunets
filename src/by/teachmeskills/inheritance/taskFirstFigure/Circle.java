package by.teachmeskills.inheritance.taskFirstFigure;

public class Circle extends Figure {
    private String name;
    private double radius;
    public static final double PI = 3.14;
    private double square;
    private double perimetr;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void countSquare() {
        square = PI * Math.pow(radius, 2);
        System.out.println("Площадь " + name + " равна " + square);
    }

    @Override
    public void countPerimetr() {
        perimetr = 2 * PI * radius;
        System.out.println("Периметр " + name + " равен " + perimetr);
    }
}
