package ru.akobelskiy.partone.chapterseven;

public class Outer {
    int outerX = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("display(): outer_x = " + outerX);
        }
    }
}
