package Java_Basics;

class TypeConversion {
    public static void main(String[] args){
        //Implicit conversion
        //order: byte → short → int → long → float → double
        int a=10;
        double b=a;
        System.out.println("Implicit conversion:");
        System.out.println(a);
        System.out.println(b);

        //Explicit conversion
        double c=6.45;
        int d=(int)c;
        System.out.println("Explicit conversion:");
        System.out.println(c);
        System.out.println(d);

        //Char to Number Conversion
        char ch='A';
        int e=ch;
        System.out.println("Char to Number conversion:");
        System.out.println("A is converted to: "+ e);

        //String conversion
        int n=Integer.parseInt("100");
        System.out.println("String is converted to: "+ n);
        double dou=Double.parseDouble("45.35");
        System.out.println("String converted to double: "+ dou);
        String s1 = String.valueOf(50);
        System.out.println("Integer converted to String: "+ s1);

    }
}