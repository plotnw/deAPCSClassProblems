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
public class problem6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("year");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println(problem6(x));
        
    }
    public static boolean problem6 (int x) {
        if (x % 4 == 0) {
            if (x % 100 == 0 && x % 400 != 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    } 
       
    }

