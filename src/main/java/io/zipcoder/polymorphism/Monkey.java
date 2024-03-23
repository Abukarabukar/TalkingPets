package io.zipcoder.polymorphism;

public class Monkey extends Pet{

    public Monkey(String name, int age) {
        super(name, age);
    }

    public Monkey(String name) {
        super(name);
    }

    public Monkey() {
        super();
    }



    @Override
    public String speak() {
        return "KUKU-KAKA!";
    }
}
