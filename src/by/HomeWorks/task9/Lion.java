package by.HomeWorks.task9;

public class Lion extends Animal {
    private String name;
    private String breed;
    private double averageWeight;

    public Lion(String name, String breed, double averageWeight, String color, int maxLifespan) {
        super(color, maxLifespan, "мясо");
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    public void makeSound() {
        System.out.println(name + " рычит");
    }

    public void play() {
        System.out.println(name + " играет");
    }

    public String toString() {
        return "Лев  \n имя " + name + " " + "звук " + breed + " " + " средний вес " + averageWeight + " "
                + super.toString();
    }
}
