package by.teachmeskills.inheritance.taskFirstFigure;

public class FigureDemo {
    /*
    Figure
    Написать иерархию классов «Фигуры». Фигура -> Треугольник -> Прямоугольник -> Круг.
    Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
    Создать массив из 5 фигур.
    Вывести на экран сумму периметра всех фигур в массиве.
     */
    public static void main(String[] args) {
        Figure[] array = new Figure[5];
        Circle circle1 = new Circle("Круг", 10);
        Rectangle rectangle1 = new Rectangle("Прямоугольник 1", 8, 5);
        Triangle triangle1 = new Triangle("Треугольник", 35, 10, 10, 8);
        Rectangle rectangle2 = new Rectangle("Прямоугольник 2", 4, 2);
        Rectangle rectangle3 = new Rectangle("Прямоугольник 3", 7, 9);

        circle1.countSquare();
        circle1.countPerimetr();

        triangle1.countSquare();
        triangle1.countPerimetr();

        rectangle1.countSquare();
        rectangle1.countPerimetr();
        rectangle2.countSquare();
        rectangle2.countPerimetr();
        rectangle3.countSquare();
        rectangle3.countPerimetr();
    }
}
