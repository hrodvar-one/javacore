package ru.akobelskiy.partone.chapterseven;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test o) {
        return o.a == a && o.b == b;
    }
}
