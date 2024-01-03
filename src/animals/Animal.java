package animals;

import validators.NumberValidator;

import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Animal {
     private String name = "";
     private int age = -1;
     private int weight = -1;
     private String color = "";

     private NumberValidator numberValidator = new NumberValidator();

public Animal(String name, int age, int weight, String colorData) {
          this.name = name;
          this.age = age;
          this.weight = weight;
          this.color = color;
     }

     public void say() {
          System.out.println("Я говорю");
     }
     public void go() {
          System.out.println("Я иду");
     };
     public void drink() {
          System.out.println("Я пью");
     };
     public void eat() {
          System.out.println("Я ем");
     };

     public void setName(String name) {
          this.name = name;
     }

     public void setAge(Scanner scanner) {
          int animalAge = -1;
          while(true) {
               String ageStr = scanner.next();
               if (numberValidator.isNumber(ageStr, Pattern.compile("^\\d+$"))) {
                    animalAge = Integer.parseInt(ageStr);
                    if(animalAge > 50 || animalAge <= 0) {
                         System.out.println("Возраст животного не может быть > 50 или <= 0");
                         continue;
                    }
                    break;
               }
               System.out.println("Ошибка возраста");
          }
          this.age = animalAge;
     }

     public void setWeight(Scanner scanner) {
          int animalWeight = -1;
          while(true) {
               String weightStr = scanner.next();
               if (numberValidator.isNumber(weightStr, Pattern.compile("^\\d+$"))) {
                    animalWeight = Integer.parseInt(weightStr);
                    if(animalWeight > 50 || animalWeight <= 0) {
                         System.out.println("Вес животного не может быть > 50 или <= 0");
                         continue;
                    }
                    break;
               }
               System.out.println("Ошибка веса");
          }
          this.weight = animalWeight;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public String getName() {
          return name;
     }

     public int getAge() {
          return age;
     }

     public int getWeight() {
          return weight;
     }

     public String getColor() {
          return color;
     }

     @Override
     public String toString() {

          String yearCase = getYearCase();
          if(yearCase == null) {
               return "Возраст введен неверно";
          }
          return String.format("Привет! меня зовут %s, мне %d %s, я вешу - %d кг, мой цвет - %s",
                  this.name,
                  this.age,
                  yearCase,
                  this.weight,
                  this.color
          );
     }
     private String getYearCase() {
          if(this.age <= 0 || this.age > 50) {
               return null;
     }
          if(this.age >= 11 && this.age <= 19) {
               return "лет";
          }

          int remainder = this.age % 10;
          if(remainder == 0 || remainder >= 5) {
               return "лет";
          }

          if(remainder == 1) {
               return "год";
          }

          if(remainder >= 2) {
               return "года";
          }

          return null;

     }
}
