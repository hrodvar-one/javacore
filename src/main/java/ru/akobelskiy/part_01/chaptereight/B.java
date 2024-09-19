package ru.akobelskiy.part_01.chaptereight;

public class B extends A {
    public int k;
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    public B() {

    }

    void show() {
        System.out.println("i в суперклассе: " + super.i);
        System.out.println("i в подклассе: " + i);
    }

    public void showk() {
    }

    public void sum() {
    }
}
