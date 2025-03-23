package by.HomeWorks.task12;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lexus", 50);
        Motorcycle motorcycle = new Motorcycle("Harley", 190);

        car.setName("Opel");
        car.setEmissions(120);

        motorcycle.setName("Suzuki");
        motorcycle.setEmissions(55);

        Garage<Car> carGarage = new Garage<>(car);
        Garage<Motorcycle> motorcycleGarage = new Garage<>(motorcycle);

        System.out.println("Car: " + carGarage.getVehicleName());
        carGarage.checkEntryPermission();

        System.out.println("Motorcycle: " + motorcycleGarage.getVehicleName());
        motorcycleGarage.checkEntryPermission();
    }
}
