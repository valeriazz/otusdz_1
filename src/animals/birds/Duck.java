package animals.birds;

import animals.Animal;

public class Duck extends Animal implements IFly {
    public Duck(String name, int age, int weight, String colorData) {
        super(name, age, weight, colorData);
    }
    public void fly() {
        System.out.println("Я лечу");
    };

    public void say() {
        System.out.println("Кря");
    }
}
