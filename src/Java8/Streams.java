package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    /*
    Streams provide a functional, declarative way to process collections of data (like lists).
    Think of a stream pipeline like:
    SOURCE → INTERMEDIATE OPERATIONS → TERMINAL OPERATION
    | Operation         | Type         | Purpose                            |
    | ----------------- | ------------ | ---------------------------------- |
    | filter(Predicate) | Intermediate | Keep elements that match condition |
    | map(Function)     | Intermediate | Convert each element               |
    | sorted()          | Intermediate | Sort elements                      |
    | distinct()        | Intermediate | Remove duplicates                  |
    | limit(n)          | Intermediate | Take first n elements              |
    | skip(n)           | Intermediate | Skip first n elements              |
    | collect()         | Terminal     | Convert to list/set/map            |
    | reduce()          | Terminal     | Combine to single value            |
    | forEach()         | Terminal     | Iterate and print/do something     |

     */
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Ajith", 60000),
                new Employee("Ravi", 45000),
                new Employee("Manoj", 70000)
        );

        List<String> result =
                employees.stream()
                        .filter(e -> e.salary > 50000)  // filter
                        .map(e -> e.name.toUpperCase()) // map
                        .sorted()                       // sort
                        .collect(Collectors.toList());  // collect

        System.out.println(result); // [AJITH, MANOJ]


    }
}

class Employee {
String name;
int salary;

Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
}
}