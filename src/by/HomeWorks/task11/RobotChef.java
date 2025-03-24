package by.HomeWorks.task11;

public class RobotChef implements Robot {
    private String model;
    private int powerConsumption;
    private String country;
    private String cookingEquipment;
    private boolean isOn;

    public RobotChef(String model, int powerConsumption, String country, String cookingEquipment) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.country = country;
        this.cookingEquipment = cookingEquipment;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(model + " включен.");
    }

    @Override
    public void uniquePossibility() {
        System.out.println(model + " готовит");
    }
}
