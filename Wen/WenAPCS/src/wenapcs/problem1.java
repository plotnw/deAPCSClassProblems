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
public class problem1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("number");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println(problem1 (x));
    }
    public static int problem1 (int x) {
        return x * (x + 1) / 2;
    }
}
