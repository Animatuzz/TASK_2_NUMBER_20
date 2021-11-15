package com.Animatuz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int cardType = readVariable("значение переменной N (номер карты от 6 до 14 включительно): ", true);
        int cardSuit = readVariable("значение переменной M (масть карты от 1 до 4 включительно): ", false);

        chooseCard(cardType, cardSuit);

    }

    static int readVariable(String variable, boolean isType) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите " + variable);
        int value = scanner.nextInt();
        if (isType && (value < 6 || value > 14)) {
            System.out.println("Ошибка! Введённые данные не входят в диапазон переменной. Пояснение:(6<=N<=14)");
            return readVariable(variable, true);
        }
        if (!isType && (value < 1 || value > 4)) {
            System.out.println("Ошибка! Введённые данные не входят в диапазон переменной. Пояснение:(6<=M<=14)");
            return readVariable(variable, false);
        }
        return value;
    }

    static void chooseCard(int cardType, int cardSuit) {
        switch (cardType) {
            case 6 -> System.out.print("Шестёрка ");
            case 7 -> System.out.print("Семёрка ");
            case 8 -> System.out.print("Восмёрка ");
            case 9 -> System.out.print("Девятка ");
            case 10 -> System.out.print("Десятка ");
            case 11 -> System.out.print("Валет ");
            case 12 -> System.out.print("Дама ");
            case 13 -> System.out.print("Король ");
            case 14 -> System.out.print("Туз ");
        }
        switch (cardSuit) {
            case 1 -> System.out.println("пик");
            case 2 -> System.out.println("треф");
            case 3 -> System.out.println("бубен");
            case 4 -> System.out.println("червей");
        }
    }

}