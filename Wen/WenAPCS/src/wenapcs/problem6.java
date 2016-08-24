package wenapcs;
import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("year");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println(problem6(x));  
    }
    public static boolean problem6 (int x) {
        if (x % 4 == 0) 
        {
            if (x % 100 == 0 && x % 400 != 0) 
            {
                return false;
            } 
            else 
            {
                return true;
            }
        }   
        else 
        {
            return false;
        }
    }     
}