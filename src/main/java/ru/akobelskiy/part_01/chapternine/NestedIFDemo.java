package ru.akobelskiy.part_01.chapternine;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10)) {
            System.out.println("10 не является отрицательным");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("Это выводиться не будет");
        }
    }
}
