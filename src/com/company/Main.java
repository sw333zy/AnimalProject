package com.company;
//From what I understand a contsrtutor is created of animal which has things that all animals do
//then new animals are created such as a new cat which is a new object
//The new cat dog ect inherits the properties of animal its parent. Here it includes eat and sleep.
//Polymorphism is the interchangeability of things like a animal can become a dog cat ect.
public class Main {

    public static void main(String[] args) {
        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());


        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        Dog d = new Dog();
        print(d.eat());
        print(d.sleep());
        print(d.woof());

        Mouse m = new Mouse();
        print(m.eat());
        print(m.sleep());
        print(m.run());
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
