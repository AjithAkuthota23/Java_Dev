package Java_Basics;

public class Wrapper {
    public static void main(String[] args) {
    //In Java, wrapper classes are object representations of primitive data types.They “wrap” a primitive inside an object.
        int a = 10;            // primitive
        Integer b = a;         // autoboxing(primitive -> wrapper)

        Integer c = 20;
        int d = c;             // unboxing(wrapper -> primitive)

        String s = "100";
        int num = Integer.parseInt(s);

        System.out.println("Autoboxing b = " + b);
        System.out.println("Unboxing d = " + d);
        System.out.println("Parsed int = " + num);
    }
}
