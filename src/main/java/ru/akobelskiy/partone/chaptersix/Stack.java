package ru.akobelskiy.partone.chaptersix;

public class Stack {
    int[] stack = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Стек полон.");
        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек опустошен.");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
