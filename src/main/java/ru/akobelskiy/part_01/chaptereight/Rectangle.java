package ru.akobelskiy.part_01.chaptereight;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Внутри area() для Rectangle.");
        return dim1 * dim2;
    }
}
