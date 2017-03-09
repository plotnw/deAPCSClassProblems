package myfirstprogram;
/**
 * Hello and stuff
 * @author aburur
 * @version Sept. 2016
 */
import java.util.Scanner;
public class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        
//        System.out.print("Please enter your name: ");
//        String name = reader.nextLine();
//        System.out.println("Hello there, " + name + "!");
//        String k = "lol";
//        k.substring(10).equals(k);
        
        System.out.println((int)(Math.random() * 8));
    }
}