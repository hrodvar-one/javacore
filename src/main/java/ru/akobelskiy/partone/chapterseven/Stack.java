package ru.akobelskiy.partone.chapterseven;

public class Stack {
    private  int[] stck;
    private int tos;

    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Стек полон.");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек опустошен.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
