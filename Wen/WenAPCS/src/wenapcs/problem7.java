package wenapcs;
import java.util.Scanner;

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