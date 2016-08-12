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

public class problem5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type x1");
        int n = Integer.parseInt(reader.nextLine());
        if (problem5(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
    public static Boolean problem5 (int n) {
        double bound = Math.sqrt(n);
        if (n % 2 == 0) {
            return false;
        } else 
            for (int i = 3; i < bound; i=1+2) {
             if (n % i == 0) { 
                return false;
            }
         
    } return true;
}
}

