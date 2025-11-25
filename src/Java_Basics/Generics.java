package Java_Basics;

public class Generics {
    public static void main(String[] args) {
        //Generics allow you to write type-safe(prevents adding wrong data-type), reusable and flexible code
        Box<String> b1 = new Box<>();
        b1.set("Hello");
        System.out.println(b1.get());

        Box<Integer> b2 = new Box<>();
        b2.set(100);
        System.out.println(b2.get());
    }
}

class Box<T> {     // T = Type(This will be replaced by actual type during compile-time)
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
