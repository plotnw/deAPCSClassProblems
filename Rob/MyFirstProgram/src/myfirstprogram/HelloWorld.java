/*
Introduction to input and output

@author Robert Aburustum
@version Sept. 2016
*/

package myfirstprogram;
import java.util.Scanner;
public class HelloWorld                     // public (access specifier) class HelloWorld
{
   public static void main(String [] args)  // public (access) static void (return-type) main (name) (String [] args) (parameter list) <-- signature of the method
   { 
       System.out.println("Hello, World!"); // System (class).out.print (method) ("Hello, World!"); <-- String literal
       System.out.println();
       System.out.println("How are you?");
       
    }
}