/**
 *
 * @author aburur
 * @version Sept. 2016
 */
package myfirstprogram;
import java.util.Scanner;
public class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = reader.next();
        System.out.println("Hello there, " + name + "!");
    }
}
