package by.HomeWorks.task9;

public class Zoo {
    private Animal[] animals;
    private int count;

    public Zoo() {
        animals = new Animal[0];
        count = 0;
    }

    public void addAnimal(Animal animal) {
        Animal[] newAnimals = new Animal[count + 1];
        System.arraycopy(animals, 0, newAnimals, 0, count);
        newAnimals[count] = animal;
        animals = newAnimals;
        count++;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void removeAnimalByID(int id) {
        Animal[] newAnimals = new Animal[count - 1];
        int j = 0;
        for (Animal animal : animals) {
            if (animal.getId() != id) {
                newAnimals[j++] = animal;
            }
        }
        animals = newAnimals;
        count--;
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println();
        }
    }
}
