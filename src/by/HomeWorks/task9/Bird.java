package by.HomeWorks.task9;

public class Bird extends Animal {
    private String family;
    private int maxFlightHeight;

    public Bird(String family, int maxFlightHeight, String color, int maxLifespan) {
        super(color, maxLifespan, "насекомые");
        this.family = family;
        this.maxFlightHeight = maxFlightHeight;
    }

    public void sing() {
        System.out.println(family + " поет");
    }

    public void peck() {
        System.out.println(family + " клюет");
    }

    public void incubate() {
        System.out.println(family + " высиживает птенцов");
    }

    public void makeSound() {
        System.out.println(family + " издает звук");
    }

    public void play() {
        System.out.println(family + " играет");
    }

    public String toString() {
        return "Птица : \n семейство " + family + " " + "максимальная высота полета " + maxFlightHeight + " " +
                super.toString();
    }
}

