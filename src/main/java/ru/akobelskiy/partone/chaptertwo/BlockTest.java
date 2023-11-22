package ru.akobelskiy.partone.chaptertwo;

public class BlockTest {
    public static void main(String[] args) {
        int x;
        int y = 20;

        for (x = 0; x < 10; x++) {
            System.out.println("Значение x: " + x);
            System.out.println("Значение y: " + y);
            y = y - 2;
        }
    }
}
