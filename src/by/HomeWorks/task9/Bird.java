package by.HomeWorks.task9;

public class Bird extends Animal {
    private String family;
    private int maxFlightHeight;

    public Bird(String family, int maxFlightHeight, String color, int maxLifespan) {
        super(color, maxLifespan, "насекомые");
        this.family = family;
        this.maxFlightHeight = maxFlightHeight;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Bird bird = (Bird) obj;
        return maxFlightHeight == bird.maxFlightHeight && family.equals(bird.family);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + family.hashCode();
        result = 31 * result + maxFlightHeight;
        return result;
    }
}

