package ru.akobelskiy.partone.chaptereight;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Внутри area() для Triangle.");
        return dim1 * dim2 / 2;
    }
}
