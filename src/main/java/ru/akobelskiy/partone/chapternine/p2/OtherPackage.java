package ru.akobelskiy.partone.chapternine.p2;

import ru.akobelskiy.partone.chapternine.p1.Protection;

public class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("Конструктор класса из другого пакета");
        System.out.println("nPub = " + p.nPub);
    }
}
