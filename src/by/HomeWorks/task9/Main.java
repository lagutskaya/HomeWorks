package by.HomeWorks.task9;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Dog dog1 = new Dog("Зевс", "Японский шпиц", 7.0, "Белый", 16);
        Dog dog2 = new Dog("Джаггер", "Мини йоркшерский терьер", 2.0, "Коричневый", 16);
        Dog dog3 = new Dog("Элис", "Французский бульдог", 10.0, "Белый", 16);
        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(dog3);

        Bird bird1 = new Bird("Дрозд", 1000, "Коричневый", 5);
        Bird bird2 = new Bird("Синица", 500, "Желтый", 4);
        Bird bird3 = new Bird("Воробей", 200, "Коричневый", 3);
        zoo.addAnimal(bird1);
        zoo.addAnimal(bird2);
        zoo.addAnimal(bird3);

        System.out.println("Все животные в зоопарке : \n");
        zoo.displayAnimals();
        System.out.println("Удаляем животное с ID = 2");
        zoo.removeAnimalByID(2);
        System.out.println("Все животные в зоопарке после удаления : ");
        zoo.displayAnimals();


        System.out.println("Специфическое поведение для собак и птиц : \n ");

        for (Animal animal : zoo.getAnimals()) {
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.makeSound();
                dog.play();
                dog.bite();
                dog.jump();
                dog.run();
            } else if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                bird.makeSound();
                bird.play();
                bird.incubate();
                bird.peck();

            }
        }
        Lion lion1 = new Lion("Лева", "Берберийский", 200.0, "Золотистый", 15);
        Lion lion2 = new Lion("Лев", "Азиатский", 300.0, "Рыжий", 16);
        Lion lion3 = new Lion("Львеша", "Западноафриканский", 400.0, "Золотистый", 17);
        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(lion3);

        System.out.println("\n Все животные в зоопарке после добавления львов : \n");
        zoo.displayAnimals();

        System.out.println("Специфическое поведение для львов : \n");

        for (Animal animal : zoo.getAnimals()) {
            if (animal instanceof Lion) {
                Lion lion = (Lion) animal;
                lion.makeSound();
                lion.play();
            }
        }
        System.out.println("\nПроверка метода equals после переопределения :");
        System.out.println("Сравнение двух собак:");
        System.out.println("dog1 == dog2?\n" + dog1.equals(dog2));

        System.out.println("\nСравнение двух птиц:");
        System.out.println("bird1 == bird2?\n" + bird1.equals(bird2));

        System.out.println("\nПроверка метода hashCode после переопределения");
        System.out.println("\nХэш-коды:");
        System.out.println("Хэш-код для dog1: " + dog1.hashCode());
        System.out.println("Хэш-код для dog2: " + dog2.hashCode());
        System.out.println("Хэш-код для bird1: " + bird1.hashCode());
        System.out.println("Хэш-код для bird2: " + bird2.hashCode());    }

}
