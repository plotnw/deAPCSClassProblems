package wenapcs;
import java.util.Scanner;

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
            }    
        return true;
    }   
}