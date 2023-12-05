package ru.akobelskiy.partone.chapternine;

public class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0;
    }
}
