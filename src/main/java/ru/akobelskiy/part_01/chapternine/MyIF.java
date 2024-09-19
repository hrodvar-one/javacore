package ru.akobelskiy.part_01.chapternine;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Стандартная строка";
    }

    static int getDefaultNumber() {
        return 0;
    }
}
