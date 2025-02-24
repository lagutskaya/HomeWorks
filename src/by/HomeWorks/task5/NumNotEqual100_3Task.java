package by.HomeWorks.task5;

import java.util.Scanner;

public class NumNotEqual100_3Task {
    public static void main(String[] args) {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, которое не заканчивается на 0");
        int num = scanner.nextInt();
        if (num % 10 == 0) {
            System.out.println("Введенное число не соответствует требованиям");
            return;
        }

        int mun = 0;
        while (num != 0) {
            int c = num % 10;
            mun = mun * 10 + c;
            num /= 10;
        }
        System.out.println("Число в обратном порядке " + mun);
    }
}

