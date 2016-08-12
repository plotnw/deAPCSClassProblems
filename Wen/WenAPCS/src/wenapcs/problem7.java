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
public class problem7 {
    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
         int a = Integer.parseInt(reader.nextLine());
         int b = Integer.parseInt(reader.nextLine());
         System.out.println(isMultiple(a, b));
        }
    public static boolean isMultiple(int a, int b) {
        
        return(a % b == 0 || b % a == 0);
}

}

