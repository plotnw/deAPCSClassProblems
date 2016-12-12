/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acsl1;
import java.util.Scanner;

/**
 *
 * @author weznon
 */
public class Acsl1 {

               
    public static void main(String[] args) {
        String[] args2 = new String[0];
        System.out.println("Please enter the cards, upper case, with no commas");
        Scanner reader = new Scanner(System.in);
        String i = reader.nextLine();
        if (!stringErrorTest(i)) {
            System.out.println("something went wrong");
            main(args2);
        }
        String[][] card = {{"5"}, {"D"}};
        String[][] hand = {{"2", "6", "9", "T"}, {"D", "H", "D", "D"}};
        
        System.out.println(convertBack(step1(toCard(i.substring(0, 2)),toHand(i.substring(2)))));
        main(args2);
    }
    public static String[][] toHand (String hand) {
        String[][] handM = new String[2][5];
        for (int i = 0; i < 5; i++) {
            handM[0][i] = hand.substring(2*i, 2*i+1);
            handM[1][i] = hand.substring(2*i+1, 2*i+2);
        }
        return (handM);
    }
    public static String[][] toCard (String card) {
        String[][] cardM = new String[2][1];
        cardM[0][0] = card.substring(0, 1);
        cardM[1][0] = card.substring(1, 2);
        return cardM;
    }
    public static String[][] step1 (String[][] card, String[][] hand) {
        String suitTest = card[1][0];
        String valTest = card[0][0];
        int valTest2 = valueToInt(valTest);
        int count = 0; 
        for (int i = 0; i < hand[0].length; i++) {
            if (valTest2 <= valueToInt(hand[0][i]) && suitTest.equals(hand[1][i])) {
                count++;
            }
        }
        int count2 = 0; 
        String[][] newHand = new String[2][count];
        for (int i = 0; i < hand[0].length; i++) {
            if (valTest2 <= valueToInt(hand[0][i]) && suitTest.equals(hand[1][i])) {
                newHand[0][count2] = hand[0][i];
                newHand[1][count2] = hand[1][i];
                count2++;
            }
        }
        if (count2 == 0) {
            return (step2(card, hand));
        }
        return (min(newHand));
    }
    public static String[][] step2 (String[][] card, String[][] hand) {
        String suitTest = card[1][0];
        int[] matches = new int[hand[0].length];
        int count = 0;
        for (int i = 0; i < hand[0].length; i++) {
            if (suitTest.equals(hand[1][i])) {
                matches[i] = 1;
                count++;
            } else {
                matches[i] = 0;
            }
        }
        if (count == 0) {
            return(step3(card, hand));
        }
        String[][] sameSuitHand = new String[2][count];
        int count2 = 0;
        for (int j = 0; j < hand[0].length; j++) {
            if (matches[j] == 1) {
                sameSuitHand[0][count2] = hand[0][j];
                sameSuitHand[1][count2] = hand[1][j];
                count2++;
            }
        }
        
        return (min(sameSuitHand));
    }
    public static String[][] step3 (String[][] card, String[][] hand) {
        String[] values = hand[0];
        int[] nums = new int[values.length];
        int indexLow = 0; 
        for (int i = 0; i < values.length; i++) {
            nums[i] = valueToInt(values[i]);
        }
        int low = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (low > nums[i]) {
                low = nums[i];
                count++;
            }
        }
        int count4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == low) {
                count4++;
            }
        }
        int count2 = 0;
        String[][] newhand = new String[2][count4];
        for (int i = 0; i < nums.length; i++) {
            if (low == nums[i]) {
                newhand[0][count2] = hand[0][i];
                newhand[1][count2] = hand[1][i];
                count2++;
            }
        }
        
        return (step4(card, newhand));
    }
    public static String[][] step4 (String[][] card, String[][] hand) {
        String[][] ret = new String[2][1];
        for (int i = 0; i < hand[0].length; i++) {
            if (hand[1][i].equals("C")) {
                ret[0][0] = hand[0][i];
                ret[1][0] = hand[1][i];
                return ret;
            } 
        }
        for (int i = 0; i < hand[0].length; i++) {
            if (hand[1][i].equals("D")) {
                ret[0][0] = hand[0][i];
                ret[1][0] = hand[1][i];
                return ret;
            } 
        }
        for (int i = 0; i < hand[0].length; i++) {
            if (hand[1][i].equals("H")) {
                ret[0][0] = hand[0][i];
                ret[1][0] = hand[1][i];
                return ret;
            } 
        }
        for (int i = 0; i < hand[0].length; i++) {
            if (hand[1][i].equals("S")) {
                ret[0][0] = hand[0][i];
                ret[1][0] = hand[1][i];
                return ret;
            } 
        }
        ret[0][0] = hand[0][0];
        ret[1][0] = hand[0][0];
        return ret;
    }
    public static String convertBack (String[][] asd) {
        return (asd[0][0] + asd[1][0]);
    }
    public static int valueToInt (String value) {
            if (value.equals("A")) {
                return 1;
            } else if (value.equals("2")) {
                return 2;
            } else if (value.equals("3")) {
                return  3;
            } else if (value.equals("4")) {
                return  4;
            } else if (value.equals("5")) {
                return  5;
            } else if (value.equals("6")) {
                return  6;
            } else if (value.equals("7")) {
                return  7;
            } else if (value.equals("8")) {
                return  8;
            } else if (value.equals("9")) {
                return  9;
            } else if (value.equals("T")) {
                return  10;
            } else if (value.equals("J")) {
                return  11;
            } else if (value.equals("Q")) {
                return  12;
            } else {
                return  13;
            }
        }
    public static int[] valuesToInt (String[] values) {
        int[] ints = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals("A")) {
                ints[i] = 1;
            } else if (values[i].equals("2")) {
                ints[i] = 2;
            } else if (values[i].equals("3")) {
                ints[i] = 3;
            } else if (values[i].equals("4")) {
                ints[i] = 4;
            } else if (values[i].equals("5")) {
                ints[i] = 5;
            } else if (values[i].equals("6")) {
                ints[i] = 6;
            } else if (values[i].equals("7")) {
                ints[i] = 7;
            } else if (values[i].equals("8")) {
                ints[i] = 8;
            } else if (values[i].equals("9")) {
                ints[i] = 9;
            } else if (values[i].equals("T")) {
                ints[i] = 10;
            } else if (values[i].equals("J")) {
                ints[i] = 11;
            } else if (values[i].equals("Q")) {
                ints[i] = 12;
            } else {
                ints[i] = 13;
            }
        }
        return ints;
    }
    public static String[][] min (String[][] cards) {
        String[] values = cards[0];
        int[] nums = new int[values.length];
        int indexLow = 0; 
        for (int i = 0; i < values.length; i++) {
            nums[i] = valueToInt(values[i]);
        }
        int low = nums[0];
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] < low) {
                low = nums[j];
                indexLow = j;
            }
        }
        String[][] ret = new String[2][1];
        ret[0][0] = cards[0][indexLow];
        ret[1][0] = cards[1][indexLow];
        return ret;
    }
    public static boolean stringErrorTest (String hand) {
        if (hand.isEmpty()) {
            System.out.println("Sorry, but that string is empty. Please enter the cards again");
            return false;
        }
        if (hand.length() != 12) {
            System.out.println("Sorry, but that string is not the correct length. Make sure that no commas are put in");
            return false;
        }
        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                if (isValue(hand.substring(i, i+1))) {
                    ;
                } else {
                    System.out.println("at index" + i + "something went wrong");
                    return false;
                }
            } else {
                if (isSuit(hand.substring(i, i+1))) {
                    ;
                } else {
                    System.out.println("at index " + i + " something went wrong");
                    return false;
                }
            }
        }
        return (true);
    }
    public static boolean isValue(String val) {
        
        String[] acceptableValue = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
        for (int i = 0; i < acceptableValue.length; i++) {
            if (val.equals(acceptableValue[i])) {
                return true;
            }
        }
        return false;
    }
    public static boolean isSuit(String suit) {
        String[] acceptableValue = {"D", "H", "C", "S"};
        for (int i = 0; i < acceptableValue.length; i++) {
            if (suit.equals(acceptableValue[i])) {
                return true;
            }
        }
        return false;
    }
    
}
