package ru.akobelskiy.part_01.chapterfive;

public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : nums) {
            System.out.println("Значение: " + x);
            sum += x;
            if (x == 5) {
                break;
            }
        }
        System.out.println("Сумма первых пяти элементов: " + sum);
    }
}
