package ru.akobelskiy.partone.chapterseven;

public class AccessTest {
    public static void main(String[] args) {
        Test5 ob = new Test5();
        ob.a = 10;
        ob.b = 20;
        ob.setc(100);
        System.out.println("a, b и c: " + ob.a + " "
                + ob.b + " " + ob.getc());
    }
}
