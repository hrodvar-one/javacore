package ru.akobelskiy.partone.chapternine.p1;

public class Derived extends Protection {
    Derived() {
        System.out.println("Конструктор производного класса");
        System.out.println("n = " + n);
        System.out.println("nPro = " + nPro);
        System.out.println("nPub = " + nPub);
    }
}
