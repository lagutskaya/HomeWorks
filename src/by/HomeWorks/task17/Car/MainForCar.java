package by.HomeWorks.task17.Car;

import java.io.*;

public class MainForCar {
    private static final String FILE_PATH = "src/Files/serialization.txt";

    public static void main(String[] args) {
        Car car = new Car("Lexus", 240, "Japan");

        serializeCar(car);

        Car deserializedCar = deserializeCar();
        System.out.println("Десериализованный автомобиль: " + deserializedCar);
    }

    public static void serializeCar(Car car) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(car);
            System.out.println("Автомобиль сериализован.");
        } catch (IOException e) {
            System.err.println("Ошибка при сериализации: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static Car deserializeCar() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (Car) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка при десериализации: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}