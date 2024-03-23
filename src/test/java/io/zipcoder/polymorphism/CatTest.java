package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {



    @Test
    public void testCatConstructorAgeName(){
        String name = "Dasi";
        int age = 6;
        Dog dog = new Dog(name, age);

        Assert.assertEquals(name, dog.getName());
        Assert.assertEquals(age, dog.getAge());
    }



    //Cat
    @Test
    public void testCatConstructorName(){
        String name = "Dasi";
        int age = 0;
        Dog dog = new Dog(name);

        Assert.assertEquals(name, dog.getName());
    }


    @Test
    public void testCatSpeak(){
        Cat cat = new Cat();

        String actual = cat.speak();

        Assert.assertEquals("Meow!", actual);
    }
}
