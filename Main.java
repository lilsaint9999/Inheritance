package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal",1, 1,5,5);
        Dog dog = new Dog(":Yorkie", 8, 20, 2, 4,1,20,"silky");
        Fish fish = new Fish("pupi",1,1,2,2,2);

        animal.eat();


    }
}
