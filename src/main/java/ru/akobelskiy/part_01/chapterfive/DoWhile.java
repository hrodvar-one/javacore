package ru.akobelskiy.part_01.chapterfive;

public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("Импульс номер " + n);
            n--;
        } while (n > 0);
    }
}
