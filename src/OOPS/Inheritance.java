package OOPS;
// Inheritance: acquiring properties & methods of parent class in the child class

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal d1 = new Dog();
        Animal d2 = new Animal();
        d.eat();  // inherited
        d.bark(); // own
        d1.eat(); //own
        d2.eat(); //own
    }
}

