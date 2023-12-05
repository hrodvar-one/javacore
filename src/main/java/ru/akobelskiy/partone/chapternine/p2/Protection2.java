package ru.akobelskiy.partone.chapternine.p2;

import ru.akobelskiy.partone.chapternine.p1.Protection;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println("Конструктор производного класса из другого пакета");
        System.out.println("nPro = " + nPro);
        System.out.println("nPub = " + nPub);
    }
}
