package ru.akobelskiy.part_01.chapterfive;

public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Перед оператором return.");
        if (t) {
            return;
        }
        System.out.println("Это выполняться не будет.");
    }
}
