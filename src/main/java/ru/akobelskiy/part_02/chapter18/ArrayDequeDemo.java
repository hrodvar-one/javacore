package ru.akobelskiy.part_02.chapter18;

/*
Продемонстрировать применение класса ArrayDeque
 */

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // создать двухстороннюю очередь
        ArrayDeque<String> adq = new ArrayDeque<String>();

        // использовать класса ArrayDeque для организации стека
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.print("Извлечение из стека: ");

        while (adq.peek() != null) {
            System.out.print(adq.pop() + " ");
        }

        System.out.println();
    }
}
