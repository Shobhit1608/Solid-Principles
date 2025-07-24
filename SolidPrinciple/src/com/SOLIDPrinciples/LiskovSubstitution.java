package com.SOLIDPrinciples;

//Liskov - Substitution pRinciple

interface Bird {
    void eat();
}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    public void eat() {
        System.out.println("Sparrow eats insects.");
    }

    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}

class Penguin implements Bird {
    public void eat() {
        System.out.println("Penguin eats fish.");
    }
}

public class LiskovSubstitution {
    public static void main(String[] args) {
    	
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        sparrow.eat();  
        penguin.eat();  

        FlyingBird flyingSparrow = new Sparrow();
        flyingSparrow.fly(); 

    }
}
