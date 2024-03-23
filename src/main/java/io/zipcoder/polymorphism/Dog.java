package io.zipcoder.polymorphism;

import java.sql.Array;
import java.util.HashMap;

public class Dog extends Pet {

    //  String name = "No Name";
    public Dog(String name, int age) {
//Super is calling this constructor of super class (Parents) "only with constructor"
        super(name, age);




    }

    public Dog(String name) {
        super(name);
    }

    public Dog() {
       super();

    }

    public Dog(int age) {
        super(age);
    }

    @Override
    public String speak() {
        return "Woof!";
    }
}
