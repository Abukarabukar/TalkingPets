package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    static Scanner scanner = new Scanner(System.in);
//    static ArrayList<String> pets = new ArrayList<String>(); >>>why this one is wrong
    static ArrayList<Pet> pets = new ArrayList<>();
    public static void main(String[] args) {
        new MainApplication().startMessage();

        System.out.println("Hey! Welcome, How many pets do you have?");
        int numberOfPets = scanner.nextInt();
//        Cat cat = new Cat();


        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("What is the tpye of pet " + (i + 1) + "?");
//            System.out.println("What the Name of the Pet?"); >>>what this not worked probebly
            String petType = scanner.next();
            System.out.println("What is the name pf the pet?");
            String name = scanner.next();
            System.out.println("What is the age of the pet?");
            int age = scanner.nextInt();
//from this >>
            Pet pet;
            if (petType.equalsIgnoreCase("cat")) {
                pet = new Cat(name, age);
            }
                else if (petType.equalsIgnoreCase("dog")) {
                    pet = new Dog(name, age);
                }
            else if (petType.equalsIgnoreCase("monkey")) {
                pet = new Monkey(name, age);
            }
            else {
                // Add more conditions for other pet types if needed
                pet = new Pet(name, age); // Default to generic pet
            }
            pets.add(pet);
        }

        for (Pet pet : pets) {
            System.out.println(pet.getName() + " is "+ pet.getAge() + " years old " +"and says " + pet.speak());
        }
// explain this to me ^^^^^^^^
}

//I need to write user input to ask how many animal do you have and what type if they type cat , print name + meow

public void startMessage() {
    System.out.println("Welcome");
}



//why the cat name only work


}