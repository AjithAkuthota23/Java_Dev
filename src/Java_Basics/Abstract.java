package Java_Basics;

 abstract class Abstraction {
    abstract void unimplemented();
    void newMethod(){
        System.out.println("Implemented method in the Abstract class");
    }
}

class Implement extends Abstraction {
    @Override
    void unimplemented() {
        System.out.println("Implemented method outside Abstract class");
    }
}

public class Abstract{
    public static void main(String[] args) {
        Abstraction obj=new Implement ();
        obj.unimplemented();
        obj.newMethod();
    }
}

