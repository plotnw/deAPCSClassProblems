/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acsl2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author weznon
 */
public class Acsl2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the number");
        System.out.println("Example: 31415926538");
                String[] elClassico = {};

        Scanner read = new Scanner(System.in);
        String value1 = read.next();
        if (value1.matches("[0-9]*")) {
            ;
        } else {
            System.out.println("something is wrong with your number");
            main(elClassico);
        }
        //printArray(turnToInt(value1));
        //printArray(reverse(turnToInt(value1)));
        printArray(reverse(mainLogic(turnToInt(value1))));
        //printArray(turnToInt(value1));
        //elClassico recursive main
        main(elClassico);
        
    }
    
    //main logic(?)
    public static ArrayList<Integer> mainLogic(ArrayList<Integer> input) {
        if (input.size() == 1) {
            return input;
        }
        ArrayList fin = new ArrayList<Integer>();
        fin.add(0, input.get(0)); input.remove(0); //add the first digit
        //fin.add(0, input.get(0));
        return(mainLogic2(fin, reverse(input), false));
    }
    
    public static ArrayList<Integer> mainLogic2(ArrayList<Integer> create, ArrayList<Integer> seed, boolean skiperinoKripperino) {
        if (seed.size() <= 0) {
            //System.out.println("idek");
            if (create.get(0) < create.get(1)) {
                //System.out.println("failed 53");
                create.remove(0);
            }
            return create;
        }
        if (!skiperinoKripperino) {
            
            
            create.add(0, seed.get(0));
            //System.out.println("59");
            seed.remove(0);
        } else {
            //System.out.println("skip kripp");
        }
        if (create.get(0) > create.get(1)) {
            //System.out.println("1");
            return(mainLogic2(create, reverse(seed), false));
        } else {
            //System.out.println("2------");
            //printArray(create);
            //System.out.println("wut");
            if (seed.isEmpty()) {
                return(mainLogic2(create, seed, false));
            }
            //printArray(seed);
            create.set(0, addDigit(create.get(0), seed.get(0)));
            seed.remove(0);
            if (create.get(0) > create.get(1)) {
                //System.out.println("2.1");
                //printArray(create);
                //printArray(seed);
                return(mainLogic2(create, reverse(seed), false));
            } else {
                //System.out.println("2.2");
                return(mainLogic2(create, seed, true));           
            }
        }
        
    }
    
    //debugging related
    public static void printArray(ArrayList<Integer> lul) {
        for (int i = 0; i < lul.size(); i++) {
            System.out.print(lul.get(i));
            System.out.print(" ");
        }
        System.out.println("");
    }
    //processing related
    public static int addDigit (int i, int j) {return (10 * i + j);}
    //processing related
    public static ArrayList<Integer> reverse(ArrayList<Integer> meh) {
        ArrayList ret = new ArrayList<Integer>();
        for (int i = 0; i < meh.size(); i++) {
            ret.add(meh.get(meh.size() - i - 1));
        }
        return ret;
    }
    //parsing related
    public static ArrayList<Integer> turnToInt(String number) {
        ArrayList ret = new ArrayList<Integer>();
        for (int i = 0; i < number.length(); i++) {
            ret.add(Integer.parseInt(number.substring(i, i + 1)));          
        }
        return ret;
    }
    
}
