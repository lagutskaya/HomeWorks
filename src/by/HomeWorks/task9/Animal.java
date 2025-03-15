package by.HomeWorks.task9;

public class Animal {
    private String color;
    private int maxLifespan;
    private String foodType;
    private static int idCounter = 1;
    private int id;

    public Animal(String color, int maxLifespan, String foodType) {
        this.color = color;
        this.maxLifespan = maxLifespan;
        this.foodType = foodType;
        this.id = idCounter++;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    public void play() {
        System.out.println("Животное играет");
    }

    public String toString() {
        return " \n Дополнительная информация : \n id - " + id + " " + "цвет " + color + " " + "средняя продолжительность жизни " +
                maxLifespan + " " + " вид еды " + foodType;
    }

    public int getId() {
        return id;
    }
}