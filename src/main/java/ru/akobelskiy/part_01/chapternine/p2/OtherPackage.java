package ru.akobelskiy.part_01.chapternine.p2;

import ru.akobelskiy.part_01.chapternine.p1.Protection;

public class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("Конструктор класса из другого пакета");
        System.out.println("nPub = " + p.nPub);
    }
}
