package by.HomeWorks.task5;

public class MultiplesOf1To100_1Task {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int a;
        for (a = 1; a <= 100; a++) {
            if (a % 7 == 0 || a % 3 == 0) {
                System.out.println(a);
            }
        }
    }
}
