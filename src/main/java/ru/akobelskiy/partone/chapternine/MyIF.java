package ru.akobelskiy.partone.chapternine;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Стандартная строка";
    }
}
