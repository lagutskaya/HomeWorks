package by.HomeWorks.task12;

public class Garage<T extends Vehicle> {
    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public void checkEntryPermission() {
        if (vehicle.getEmissions() > 100) {
            System.out.println("Въезд запрещен, так как количество выбросов превышает допустимое значение.");
        } else {
            System.out.println("Въезд разрешен.");
        }
    }

    public String getVehicleName() {
        return vehicle.getName();
    }
}
