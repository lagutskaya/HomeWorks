package by.HomeWorks.task9;

public class Dog extends Animal {
    private String name;
    private String breed;
    private double averageWeight;

    public Dog(String name, String breed, double averageWeight, String color, int maxLifespan) {
        super(color, maxLifespan, "мясо");
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    public void bark() {
        System.out.println(name + " лает");
    }

    public void bite() {
        System.out.println(name + " кусает");
    }

    public void run() {
        System.out.println(name + " бегает");
    }

    public void jump() {
        System.out.println(name + " прыгает");
    }

    public void makeSound() {
        System.out.println(name + " гавкает");
    }

    public void play() {
        System.out.println(name + " играет");
    }

    public String toString() {
        return "Собака : \n имя " + name + " " + "порода " + breed + " " + "средний вес " + averageWeight + " " +
                super.toString();
    }
}

