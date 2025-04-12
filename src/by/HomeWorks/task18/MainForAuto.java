package by.HomeWorks.task18;

import by.HomeWorks.task18.Runnable.Auto;

public class MainForAuto {
    public static void main(String[] args) {
        Auto car1 = new Auto("Lexus", "5615XB-7", 3000);
        Auto car2 = new Auto("Mazda", "7777AA-5", 2000);
        Auto car3 = new Auto("Opel", "8129MP-1", 4000);

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);

        try {
            thread1.start();
            thread1.join();

            thread2.start();
            thread2.join();

            thread3.start();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
