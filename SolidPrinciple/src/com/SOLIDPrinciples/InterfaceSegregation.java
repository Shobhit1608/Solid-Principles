package com.SOLIDPrinciples;

//Interface Segregation

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Human is working.");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating.");
    }
}

class Animal implements Eatable {
    @Override
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

public class InterfaceSegregation {
    public static void main(String[] args) {
        Workable humanWorker = new Human();
        Eatable humanEater = new Human();
        Eatable animal = new Animal();

        humanWorker.work();
        humanEater.eat();
        animal.eat();
    }
}
