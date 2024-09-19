package ru.akobelskiy.part_01.chaptersix;

class Box {
    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Конструирование Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

