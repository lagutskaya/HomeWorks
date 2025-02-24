package by.HomeWorks.task5;

import java.util.Scanner;

public class TwoPositiveNum_2Task {
    public static void main(String [] args){
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = 0;
        if (number1 > number2) {
            int x = number1;
            number1 = number2;
            number2 = x;
        }
        int current = number1;
        while (current <= number2) {
            sum += current;
            current++;
        }
        System.out.println("Сумма всех чисел от " + number1 + " до " + number2 + " равна " + sum);
    }
}
