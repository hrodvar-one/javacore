package ru.akobelskiy.part_01.chapterfour;

public class ByteShift {
    public static void main(String[] args) {
        byte a = 64;
        byte b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Первоначальное значение a: " + a);
        System.out.println("i и b: " + i + " " + b);
    }
}