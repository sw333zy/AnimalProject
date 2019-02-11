package com.company;

public class Mouse extends Animal{
    public Mouse() {
        System.out.println("Now I am a Mouse!");
    }

    @Override
    public String sleep() {
        return "A Mouse sleeps...";
    }

    @Override
    public String eat() {
        return "A Mouse eats...";
    }

    public String run() {
        return "A mouse runs...";
    }
}
