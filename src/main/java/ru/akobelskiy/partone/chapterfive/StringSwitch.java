package ru.akobelskiy.partone.chapterfive;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "two";
        switch (str) {
            case "one":
                System.out.println("один");
                break;
            case "two":
                System.out.println("два");
                break;
            case "three":
                System.out.println("три");
                break;
            default:
                System.out.println("Совпадений нет");
                break;
        }
    }
}
