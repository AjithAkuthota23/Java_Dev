package Java_Basics;

public class StringMemory {
 public static void main(String[] args){
     /*
     String stores memory in two ways
     1. String constant Pool: Inside the Heap- but is special reserved memory area
     -> Strings in SCP are immutable
     -> SCP avoids creating duplicate String objects
     2. Heap memory: where all the objects are generally stored
     -> Stores objects created using new keyword
     */
     String s1= "Java"; //stored in SCP
     String s2= "Java"; // since this is also SCP, no new object will be created

     String s3= new String("Java"); //stored in Heap
     String s4= new String("Java");// new object will be created

     System.out.println("Strings in SCP: "+(s1==s2)); //true
     System.out.println("One String in SCP and other in Heap: " +(s1==s3)); //false
     System.out.println("Both Strings in Heap: "+ (s3==s4)); //false

     String s5= s3.intern();
     System.out.println("Intern returns SCP reference: "+ (s1==s5)); //true
 }
}
