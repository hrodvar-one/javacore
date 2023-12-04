package ru.akobelskiy.partone.chapterseven;

public class CallByValue {
    public static void main(String[] args) {
        Test2 ob = new Test2();
        int a = 15;
        int b = 20;
        System.out.println("a и b перед вызовом: " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a и b после вызова: " + a + " " + b);
    }
}
