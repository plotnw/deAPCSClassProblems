/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wenapcs;
import java.util.Scanner;
/**
 *
 * @author Plotnw
 */
public class problem3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a");
        double a = Double.parseDouble(reader.nextLine());
        System.out.println("Type b:");
        double b = Double.parseDouble(reader.nextLine());
        System.out.println("Type c:");
        double c = Double.parseDouble(reader.nextLine());
        System.out.println(problem3x1 (a, b, c));
        System.out.println(problem3x2 (a, b, c));
        
    }
    public static String problem3x1 (double a, double b, double c) {
       double discriminant = Math.pow(b, 2) - 4 * a * c;
       double denominator = 2 * a;
       if (discriminant < 0 == false) {
           return (Double.toString((-b + Math.sqrt(discriminant)) / denominator));
       } else {
           return "Imaginary Root";
       }
          
}
    public static String problem3x2 (double a, double b, double c) {
       double discriminant = Math.pow(b, 2) - 4 * a * c;
       double denominator = 2 * a;
       if (discriminant < 0 == false) {
           return (Double.toString((-b - Math.sqrt(discriminant)) / denominator));
       } else {
           return "Imaginary Root";
       }
          
}
}

