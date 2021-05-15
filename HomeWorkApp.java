package ru.geekbrains.HomeWorkApp;

public class HomeWorkApp {

    public static void main(String[] args) {
        printFreeWords();

        checkSumSign();

        printСolor();

        compareNumbers();
    }

    public static void printFreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 11;
        int b = 20;
        int sum = a + b;
        if (sum >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public static void printСolor() {
        int value = 124;
        if (value <= 0) System.out.println("Красный");
        else if (value > 0 && value <= 100) System.out.println("Жёлтый");
        else System.out.println("Зелёный");
    }

    public static void compareNumbers() {
        int a = 98;
        int b = 71;
        if (a>=b) System.out.println("a >= b");
        else System.out.println("a < b");
    }
}
