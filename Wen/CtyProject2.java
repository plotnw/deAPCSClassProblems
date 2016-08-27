/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctyproject2;
import java.util.Random;

/**
 *
 * @author weznon
 */
public class CtyProject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("AND THEIR OFF");
        int tortoise = 1;
        int hare = 1;
        System.out.println(" |S| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |");
        tortoise = increment(1, tortoise);
        hare = increment(0, hare);
        while (tortoise < 50 && hare < 50) {
            System.out.println(printer(tortoise, hare));
            tortoise = increment(1, tortoise);
            hare = increment(0, hare);
        }
        if(tortoise >= 50 && hare >= 50) {
            System.out.println("ITS A TIE!");
        } else if(tortoise > hare) { 
            System.out.println("TORTOISE WINS, HARE CAN GO SUCK A DICK");
        } else {
            System.out.println("HARE SUCKS SORRY WINS NOT SUCKS");
        }
    }
    public static int increment(int x, int y) {
        Random random = new Random();
        int idek = y;
        int t = random.nextInt(10) + 1;
        int h = random.nextInt(10) + 1;
        if (x == 1) {
            if (t <= 5) {
                idek += 3;
            } else if (t == 6 || t == 7 || t == 8) {
                idek += 1;
            } else {
                idek -= 6;
            }
        } else {
            if (h == 1 || h == 2) {
                idek += 9;
            } else if (h == 3 || h == 4 || h == 5) {
                idek += 1;
            } else if (h == 6) {
                idek -= 12;
            } else if (h == 7 || h == 8) {
                idek -= 2;
            } else {
                ;
            }
        }
        if (idek <=0) {
            idek = 1;
        }
        return idek;
    }
    public static String printer(int x, int y) {
        String ayy = "";
        for (int i = 0; i <= 50; i++) {
            if (i == x && x == y) {
                ayy += "O|";
            } else if (i == x && x != y) {
                ayy += "T|";
            } else if (i == y && x != y) {
                ayy += "H|";
            } else {
                ayy += " |";
            }
        }
        return ayy;
    }
}
