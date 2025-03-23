package by.HomeWorks.task11;

public class Main {
    public static void main(String[] args) {
        RobotChef chef = new RobotChef("Робот - повар", 500, "Китай", "Блендер");
        RobotDemer deminer = new RobotDemer("Робот - сапер", 700, "CH-123", "Металл", "Штука для разминирования");
        RobotBuilder builder = new RobotBuilder("Робот - строитель", 600, "США", "Кран");

        System.out.println("Включение роботов");
        chef.turnOn();
        deminer.turnOn();
        builder.turnOn();

        System.out.println("\nВывод информации о ремонте роботов");
        chef.repairRobot();
        deminer.repairRobot();
        builder.repairRobot();

        Robot[] allRobotsExhibition = {deminer, builder, chef};
        RobotEngineer[] engineerRobotsExhibition = {deminer, builder};
        RobotDemer[] sapperRobotsExhibition = {deminer};

        System.out.println("\nВыставка : все роботы");
        for (Robot robot : allRobotsExhibition) {
            robot.uniquePossibility();
        }

        System.out.println("\nВыставка : роботы - инженеры");
        for (RobotEngineer engineerRobot : engineerRobotsExhibition) {
            engineerRobot.uniquePossibility();
            engineerRobot.createItem();
        }

        System.out.println("\nВыставка : роботы - саперы");
        for (RobotDemer sapperRobot : sapperRobotsExhibition) {
            sapperRobot.uniquePossibility();
        }
    }
}
