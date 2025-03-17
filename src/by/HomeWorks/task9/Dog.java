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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj == null || getClass() != obj.getClass())) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Dog dog = (Dog) obj;
        return Double.compare(dog.averageWeight, averageWeight) == 0 && name.equals(dog.name) && breed.equals(dog.breed);
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + breed.hashCode();
        long weightBits = Double.doubleToLongBits(averageWeight);
        int weightHash = (int) (weightBits ^ (weightBits >>> 32));
        result = 31 * result + weightHash;
        return result;
    }

}

