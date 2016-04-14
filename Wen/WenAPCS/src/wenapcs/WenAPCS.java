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
public class WenAPCS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int problem = Integer.parseInt(reader.nextLine());
        if (problem == 1) {
            int n = Integer.parseInt(reader.nextLine());
             int sum = problem1.problem1(n);
             System.out.println(sum);
        } else if (problem == 2) {
            System.out.println("Put a character: ");
            char x = (reader.nextLine().charAt(0));
            System.out.println("Put a string: ");
            String y = reader.nextLine();
            System.out.println(problem2.problem2(x, y));
        } else if (problem == 3) {
            System.out.println("Put a: ");
            double a = Double.parseDouble(reader.nextLine());
            System.out.println("Put b: ");
            double b = Double.parseDouble(reader.nextLine());
            System.out.println("Put c: ");
            double c = Double.parseDouble(reader.nextLine());
            System.out.println(problem3(a, b, c));
        } else if (problem == 4) {
            problem4;
        } else if (problem == 5) {
            problem5;
        } else if (problem == 6) {
            System.out.println("Type the number to test: ");
            int x = Integer.parseInt(reader.nextLine());
            System.out.println(problem6.problem6(x));
        } else {
            problem7;
        }
    }
    }
    
}
