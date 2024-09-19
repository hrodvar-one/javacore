package ru.akobelskiy.part_01.chapternine;

public class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0;
    }
}
