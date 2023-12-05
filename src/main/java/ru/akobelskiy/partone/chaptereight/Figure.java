package ru.akobelskiy.partone.chaptereight;

public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Площадь для Figure не определена.");
        return 0;
    }
}
