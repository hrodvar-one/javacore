package ru.akobelskiy.part_01.chapterseven;

public class Test4 {
    int a;

    Test4(int i) {
        a = i;
    }

    Test4 incrByTen() {
        return new Test4(a + 10);
    }
}
