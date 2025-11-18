package OOPS;

public class Polymorphism_Overloading {
    /*
    Polymorphism:One thing behaving in multiple ways
    Compile time polymorphism: Same method name different parameters
     Real world: Printer: It prints text, photo and PDF
     */
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(4,5));
        System.out.println(calculator.add(3.5,4.7));

    }
}

class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}
