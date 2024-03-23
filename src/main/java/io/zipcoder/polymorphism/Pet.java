package io.zipcoder.polymorphism;

public class Pet implements arithmetic_operation{
    public static String setName;
    private String name;
    private int age;

    public Pet(int age) {

        this.age = age;
    }

    public Pet() {

    }

    public Pet(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public Pet(String name) {

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public String speak() {
        return "Speeeeak";
    }

    @Override
    public void printInfo() {

    }
}

