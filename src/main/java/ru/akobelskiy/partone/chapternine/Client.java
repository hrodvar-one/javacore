package ru.akobelskiy.partone.chapternine;

public class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback() вызывается с " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Классы, которые реализуют интерфейсы, " + "могут также оперделять и другие члены.");
    }
}
