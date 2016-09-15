package javaroll;
import java.util.Random;
public class Javaroll {
    public enum Directions {Up, Down, Left, Right, Forward, Backward, Diagonally};
    public static Directions ewe = Directions.Up;
    public static void main(String[] args) {
        getEwe();
        System.out.println("You have been given " + ewe);
    }
    public static void getEwe() {
        Random rand = new Random();
        while(Directions.Up == ewe) {
            int pick = rand.nextInt(Directions.values().length);
            ewe = Directions.values()[pick];
        }
        //let(Directions.Down);
    }
    public static void let(Directions x) {
        ewe = x;
    }
    public static void around() {
     ewe = null;   
    }
}
//This code never give you up, since it loops to return a new ewe if its up
//It never will let ewe down, since its commented
//Never runs around, since the function is never called
//And since around is never run, it won't desert ewe by giving it a null value