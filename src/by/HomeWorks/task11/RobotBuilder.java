package by.HomeWorks.task11;

public class RobotBuilder implements Robot, RobotEngineer {
    private String model;
    private int powerConsumption;
    private String country;
    private String constructionEquipment;
    private boolean isOn;

    public RobotBuilder(String model, int powerConsumption, String country, String constructionEquipment) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.country = country;
        this.constructionEquipment = constructionEquipment;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(model + " включен.");
    }


    @Override
    public void uniquePossibility() {
        System.out.println(model + " строит");
    }

    @Override
    public void createItem() {
        System.out.println(model + " создаёт бетон");
    }
}
