package Java8;

import java.util.Scanner;
import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {
       /*
        Java 8 provides a set of ready-made functional interfaces in the package
        Functional interface is an interface with only one abstract method i.e implemented using lambda expressions(method representation without name, modifier and return type)
        To invoke a lambda expression, functional interface is mandatory
        There are several predefined functional interfaces:
        */
        /*
        1. Function<T, R>: Used when you take an input and return an output.
        Method: R apply(T t)
        Real-world Use:
        -> Convert Employee → Salary
        -> Convert User → UserDTO
        -> Transform data in streams (map())
         */
        System.out.println("Function<T, R>");
        Function<String, Integer> lengthFunc = str -> str.length();
        System.out.println(lengthFunc.apply("Java"));  // 4
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));  // 25
        /*
        2. BiFunction<T, U, R>: Takes two inputs and returns a result.
        Method: R apply(T t, U u);
        Real-world Use:
        -> Combine two objects (e.g., firstName + lastName)
        -> Calculate price with discount
        -> Merge two maps
         */
        System.out.println("BiFunction<T, U, R>");
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 20));  // 30
        BiFunction<String, Integer, String> info =
                (name, age) -> name + " is " + age;

        System.out.println(info.apply("Ajith", 26));
        /*
        3. Predicate<T>: Used for conditions → returns true or false.
        Method: boolean test(T t);
        Real-world Use:
        -> Validate user input
        -> Check eligible customers
        -> Filter lists in Streams
         */
        System.out.println("Predicate<T>");
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(10));  // true
        Predicate<String> longWord = s -> s.length() > 5;
        System.out.println(longWord.test("Hello"));  // false
        /*
        4. BiPredicate<T, U>: Two inputs → boolean result.
         */
        System.out.println("BiPredicate<T, U>");
        BiPredicate<String, Integer> checkLength =
                (str, len) -> str.length() == len;
        System.out.println(checkLength.test("Java", 4));  // true
        /*
        5. Consumer<T> : Used when you only consume data, no return value.
        Method: void accept(T t)
        Real-world Use:
        -> Logging
        -> Printing messages
        -> Iterating with forEach()
         */
        System.out.println("Consumer<T>");
        Consumer<String> printer = msg -> System.out.println(msg);
        printer.accept("Hello World!");
        Consumer<Integer> display = x -> System.out.println(x + 10);
        display.accept(5); // 15
        System.out.println("BiConsumer<T, U>");
        BiConsumer<String, Integer> show =
                (name, age) -> System.out.println(name + " : " + age);
        show.accept("Ajith", 30);
        /*
        6. Supplier<T>:  Just supplies or produces a value. No input, only output.
        Method: T get();
        Real-world Use:
        -> Reading config values
        -> Database connection supplier
        -> Generate IDs / tokens
         */
        System.out.println("Supplier<T>");
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get());
        Supplier<String> greet = () -> "Hello!";
        System.out.println(greet.get());


    }

}
