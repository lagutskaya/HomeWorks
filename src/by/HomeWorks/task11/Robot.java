package by.HomeWorks.task11;

public interface Robot {
    default void repairRobot() {
        System.out.println("Робот отремонтирован.");
    }

    void turnOn();

    void uniquePossibility();
}
