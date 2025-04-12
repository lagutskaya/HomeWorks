package by.HomeWorks.task18.Runnable;

public class Auto implements Runnable {
    private String name;
    private String licensePlate;
    private int stopTime;

    public Auto(String name, String licensePlate, int stopTime) {
        this.name = name;
        this.licensePlate = licensePlate;
        this.stopTime = stopTime;
    }

    @Override
    public void run() {
        drive();
    }

    private void drive() {
        System.out.println(name + " с гос. номером " + licensePlate + " начинает движение.");
        try {
            System.out.println(name + " едет...");
            Thread.sleep(1000);
            stop();
        } catch (InterruptedException e) {
            System.out.println(name + " остановился.");
        }
    }

    private void stop() throws InterruptedException {
        System.out.println(name + " останавливается на " + stopTime + " миллисекунд.");
        Thread.sleep(stopTime);
    }
}
