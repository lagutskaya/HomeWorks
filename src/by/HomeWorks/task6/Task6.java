package by.HomeWorks.task6;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println("Вывод всех значений из massive");
        int[] massive = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int c : massive) {
            System.out.println(c);
        }
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 != 0) {
                massive[i] = 0;
            }
        }
        System.out.println("Замена каждого элемента с нечётным индексом на ноль");
        for (int a : massive) {
            System.out.println(a);
        }

        System.out.println("Задача 2");
        int[] massive1 = {1, 2, 3, 4, 5};
        int[] massive2 = new int[massive1.length + 1];
        for (int i = 0; i < massive1.length; i++) {
            massive2[i] = massive1[i];
        }
        massive2[5] = 0;
        System.out.println("Значения из massive2 :");
        for (int value : massive2) {
            System.out.println(value);
        }
        System.out.println("Задача 4. Вывести числа по возрастанию");
        int[] massive4 = {1, 7, 3, 2, 4, 5, 6};
        int buf = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < massive4.length - 1; i++) {
                if (massive4[i] > massive4[i + 1]) {
                    isSorted = false;
                    buf = massive4[i];
                    massive4[i] = massive4[i + 1];
                    massive4[i + 1] = buf;
                }
            }
        }
        for (int i = 0; i < massive4.length; i++) {
            System.out.println(massive4[i]);
        }
    }
}
