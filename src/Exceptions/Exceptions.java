package Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Exceptions {
    /*
    Exception is an unwanted event that disrupts the program execution
    When exception occur, Java creates object of Exception which stops the execution of program until handled
    Checked Exceptions(Compile-time) -> Compiler forces handling
    -> IOException
    -> SQLException
    -> FileNotFoundException
    Unchecked Exceptions(Runtime) -> Compiler does not force handling
    -> ArithmeticException
    -> NullPointerException
    -> ArrayIndexOutOfBoundsException
    -> NumberFormatException
     */
    public static void main(String[] args) {
        //Compile time -> must be handled
        try {
            FileInputStream fis = new FileInputStream("abc.txt");
        } catch(IOException e) {
            System.out.println(e);
        }
        // Finally block is always executed
        finally{
            System.out.println("Finally block is executed");
        }
        //Runtime -> Need not handle
        int x = 10/0;  // ArithmeticException
    }

}
