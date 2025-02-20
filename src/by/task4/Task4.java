package by.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три числа:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        System.out.println("*******ЗАДАЧА 1*******");

        System.out.println("Четные числа:");

        if (number1 % 2 == 0) {
            System.out.println(number1);
        }

        if (number2 % 2 == 0) {
            System.out.println(number2);
        }

        if (number3 % 2 == 0) {
            System.out.println(number3);
        }
        System.out.println("*******ЗАДАЧА 2*******");

        if (number1 % 2 == 0) {
            System.out.println("Число " + number1 + " делится на 2");
        } else {
            if (number1 % 5 == 0) {
                System.out.println("Число " + number1 + " делится на 5");
            }

        }
        if (number2 % 2 == 0) {
            System.out.println("Число " + number2 + " делится на 2");
        } else {
            if (number2 % 5 == 0) {
                System.out.println("Число " + number2 + " делится на 5");
            }
        }
        if (number3 % 2 == 0) {
            System.out.println("Число " + number3 + " делится на 2");
        } else {
            if (number3 % 5 == 0) {
                System.out.println("Число " + number3 + " делится на 5");
            }
        }
        System.out.println("*******ЗАДАЧА 3*******");

        double result1 = 15.0 / number1;
        switch ((int) result1) {
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат деления равен дробному числу " + result1);
        }
        double result2 = 15.0 / number2;
        switch ((int) result2) {
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат деления равен дробному числу " + result2);
        }
        double result3 = 15.0 / number3;
        switch ((int) result3) {
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат деления равен дробному числу " + result3);
        }
    }
}
