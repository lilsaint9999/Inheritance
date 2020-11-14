package com.company;

public class Dog extends Animal  {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes= eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth= teeth;
        this.coat=coat;
    }
    public void chew() {
        System.out.println("this stupid yorky is chewing");
    }

    @Override
    public void eat() {
        System.out.println("god daemn this shit PLUSKA");
        chew();
        super.eat();
    }
    public void walk () {
        move(5);
        System.out.println("this dog i walking with 5km/h");
    }
    public void run() {
        super.move(25);
        System.out.println("its running!!!!! over 25km/h");
    }
}
