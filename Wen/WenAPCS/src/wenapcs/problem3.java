/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wenapcs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static List<Double> problem3x1 (double a, double b, double c) {
       List<Double> results = new ArrayList<>(Arrays.asList());
       double disc = Math.pow(b, 2) - 4 * a * c;
       if (a != 0 &&  disc >= 0) {
           double solution1 = ((0-b) + disc)/(2*a);
           double solution2 = ((0-b) - disc)/(2*a);
           results.add(solution1);
           results.add(solution2);
       } else if (a == 0) {
           double solution1 = 0 - (c / b);
           results.add(solution1);
       }
       return results;
}
}

