package ru.akobelskiy.partone.chapternine;

public class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Еще одна версия callback()");
        System.out.println("p в квадрате равно " + (p * p));
    }
}
