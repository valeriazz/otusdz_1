package animals.pets;

import animals.Animal;

public class Dog extends Animal {
    public Dog(String name, int age, int weight, String colorData) {
        super(name, age, weight, colorData);
    }

    public void say() {
        System.out.println("Гав");
    }
}
