package by.HomeWorks.task11;

public class RobotDemer implements Robot, RobotEngineer {
    private String model;
    private int powerConsumption;
    private String mineClearingTool;
    private String chassisNumber;
    private String material;
    private boolean isOn;

    public RobotDemer(String model, int powerConsumption, String chassisNumber, String material, String mineClearingTool) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.mineClearingTool = mineClearingTool;
        this.chassisNumber = chassisNumber;
        this.material = material;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(model + " включен.");
    }


    @Override
    public void uniquePossibility() {
        System.out.println(model + " разминирует территорию.");
    }

    @Override
    public void createItem() {
        System.out.println(model + " создает приспособление для разминирования.");
    }

    @Override
    public void repairRobot() {
        System.out.println(model + " отремонтирован");
    }
}
