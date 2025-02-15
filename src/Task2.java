public class Task2 {
    public static void main(String[] args) {
        System.out.println("Задача 1. Найти х");
        int a = 98 - 25;
        int x = a * 6;
        System.out.println("Значение x равно " + x);

        System.out.println("Задача 2. Необходимо укоротить выражение, чтобы рез-т не изменился");
        int b = 3;
        int y = 1;
        int z = 18;

        b += 5;
        y *= 9;
        z -= 6;

        System.out.println("b равно " + b);
        System.out.println("y равно " + y);
        System.out.println("z равно " + z);

        System.out.println("Задача 3. Тернарный оператор");
        int p = 35;
        int l = 65;
        int c = (p > l ? 5 : 10);
        System.out.println("Значение c равно " + c );

        System.out.println("Задача 4. Операции инкремента и декремента");
        int d = 5;
        int e = 2;
        int f = d*e;

        d++;
        e--;
        f++;
        f++;
        System.out.println("d равно " + d);
        System.out.println("e равно " + e);
        System.out.println("f равно " + f);

    }
}
