package animals.pets;

import animals.Animal;

public class Cat extends Animal {
    public Cat(String name, int age, int weight, String colorData) {
        super(name, age, weight, colorData);
    }

    public void say() {
        System.out.println("Мяу");
    }

}
