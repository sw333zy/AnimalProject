package com.company;

/*
 * This is the parent class. Also called the super class
 */
public class Animal {
    /*
    * Method header of constructor will always be public and the same name as the class
    * and that returns nothing
    * */
    public Animal() {
        System.out.println("A new animal has been created!");
    }
    public String sleep() {
        return "An animal sleeps...";
    }
    public String eat() {
        return "An animal eats...";
    }
}