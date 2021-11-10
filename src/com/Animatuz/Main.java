package com.Animatuz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int N, M, y = 0;

        printwelcomemessage();

        N = write(y);
        M = write(y);

        choose_card(N, M);

    }

    static void printwelcomemessage() {

        System.out.println("Введите последовательно N, M...   (6<=N<=14      1<=M<=4) ");

    }

    static void printerrormessage() {

        System.out.println("Ошибка!");

    }

    private static int write(int x) {

        Scanner scanner = new Scanner(System.in);

        x = scanner.nextInt();
        return x;
    }

    private static void choose_card(int N1, int M1) {

        if ((N1 <= 14) & (N1 >= 6) & (M1 >= 1) & (M1 <= 4)) {
            switch (N1) {

                case 6:
                    System.out.print("Шестёрка ");
                    break;
                case 7:
                    System.out.print("Семёрка ");
                    break;
                case 8:
                    System.out.print("Восмёрка ");
                    break;
                case 9:
                    System.out.print("Девятка ");
                    break;
                case 10:
                    System.out.print("Десятка ");
                    break;
                case 11:
                    System.out.print("Валет ");
                    break;
                case 12:
                    System.out.print("Дама ");
                    break;
                case 13:
                    System.out.print("Король ");
                    break;
                case 14:
                    System.out.print("Туз ");
                    break;


            }

            switch (M1) {

                case 1:
                    System.out.println("пик ");
                    break;
                case 2:
                    System.out.println("треф ");
                    break;
                case 3:
                    System.out.println("бубен ");
                    break;
                case 4:
                    System.out.println("червей ");
                    break;

            }
        } else {
            printerrormessage();
        }

    }

}