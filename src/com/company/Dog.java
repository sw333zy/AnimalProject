package com.company;

public class Dog extends Animal{
    public Dog() {
        System.out.println("Now I am a Dog!");
    }

    @Override
    public String sleep() {
        return "A Dog sleeps...";
    }

    @Override
    public String eat() {
        return "A Dog eats...";
    }

    public String woof() {
        return "Woof!!";
    }
}
