# Java Basics, OOP, Exceptions, Threads, Java 8, and JDBC
This document provides a clear explanation of core Java concepts: Basics, OOP, Exceptions, Threads, Java 8 Features, and JDBC.

## Java Basics
### What is Java?
Java is a platform-independent, object-oriented programming language used for building desktop, web, and enterprise applications.
It uses the principle: Write Once, Run Anywhere (WORA).

Key Features of Java:
- Platform Independent	Java bytecode runs on any machine with JVM.
- Object-Oriented	Everything is based on classes and objects.
- Secure	Built-in security manager, bytecode verification.
- Robust	Automatic memory management with garbage collection.
- Multithreaded	Supports parallel execution of tasks.
- Rich API	Strong library support.

Basic Java Program Structure
```
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```
## OOPS in Java
Java heavily uses Object-Oriented Programming System (OOPs) principles.

4 Pillars of OOPS
1. Encapsulation: Wrapping data + methods inside a class.
```
public class Employee {
    private String name;
    public void setName(String name) { this.name = name; }
}
```
2. Inheritance: Reusing properties from parent class.
```
class Animal { void sound() {} }
class Dog extends Animal { void sound() { System.out.println("Bark"); } }
```
3. Polymorphism: Same method behaving differently.
- Compile-time (Method Overloading)
- Runtime (Method Overriding)

4. Abstraction: Hiding implementation details.
```
abstract class Car {
    abstract void start();
}
```
## Exceptions in Java
What is an Exception?
An exception is an unwanted event that disrupts program execution.

Types of Exceptions
- Checked Exceptions:	Checked at compile-time (ex: SQLException, IOException).
- Unchecked Exceptions:	Occur at runtime (ex: NullPointerException).

Handling Exceptions
Using try-catch:
```
try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```
finally block: Always executes
```
finally {
    System.out.println("Cleanup code");
}
```
Throwing custom exception:
```
throw new IllegalArgumentException("Invalid input");
```
## Threads in Java
What are Threads: A thread is a lightweight process that executes concurrently.

Ways to Create Threads
1. Extending Thread class:
```
class MyThread extends Thread {
    public void run() { System.out.println("Thread running"); }
}
```
2. Implementing Runnable
```
class MyTask implements Runnable {
    public void run() { System.out.println("Task executed"); }
}
```
Thread Concepts
- Synchronization	Prevents race conditions.
- Deadlock	Two threads waiting on each other.
- Liveness/Starvation	Thread never gets CPU time.
- Thread Lifecycle	New → Runnable → Running → Blocked → Terminated

## Java 8 Features
Java 8 introduced major upgrades to Java’s functional programming capabilities.

Key Java 8 Features:
- Functional Interfaces: Interfaces with exactly one abstract method.
Example: Runnable, Callable, Comparator.

- Lambda Expressions: list.forEach(item -> System.out.println(item));

- Streams API: Used for functional data processing.
```
numbers.stream()
       .filter(n -> n % 2 == 0)
       .forEach(System.out::println);
```
- Optional Class: Avoids NullPointerException.
```
Optional<String> name = Optional.of("Ajith");
```
- Default and Static Methods in Interfaces
```
default void hello() { System.out.println("Hello"); }
```
- Method References: System.out::println

## JDBC (Java Database Connectivity)
What is JDBC: JDBC is the standard Java API to interact with relational databases using SQL.

### JDBC Steps
- Load Driver
- Establish Connection
- Create Statement
- Execute Query
- Process Results
- Close Connection

Basic JDBC Example:
```
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/test", "root", "password");

PreparedStatement ps = con.prepareStatement("SELECT * FROM users");
ResultSet rs = ps.executeQuery();

while (rs.next()) {
    System.out.println(rs.getString("name"));
}

con.close();
```
Common JDBC Classes:
- Class:	Purpose
- DriverManager:	Get database connection
- Connection:	Represents database connection
- Statement / PreparedStatement:	SQL execution
- ResultSet:	Reading query results
