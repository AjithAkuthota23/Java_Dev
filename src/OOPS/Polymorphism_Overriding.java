package OOPS;

public class Polymorphism_Overriding {
    //child class changes parent class behavior
    public static void main(String[] args) {
        Ani a = new Doggy(); // Runtime polymorphism
        a.sound();            // Bark
    }
}

class Ani {
    void sound() {
        System.out.println("Some sound...");
    }
}

class Doggy extends Ani {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Catty extends Ani {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}



