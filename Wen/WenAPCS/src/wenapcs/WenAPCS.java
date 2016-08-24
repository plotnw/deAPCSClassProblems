package wenapcs;
import java.util.Scanner;
import static wenapcs.problem4.problem4;
import static wenapcs.problem5.problem5;
import static wenapcs.problem6.problem6;
import static wenapcs.problem7.isMultiple;
public class WenAPCS {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("put question");
        int problem = Integer.parseInt(reader.nextLine());
        if (problem == 1) {
            System.out.println("Type an integer");
            int n = Integer.parseInt(reader.nextLine());
            int sum = problem1.problem1(n);
            System.out.println(sum);
        } else if (problem == 2) {
            System.out.println("Put a character: ");
            char x = (reader.nextLine().charAt(0));
            System.out.println("Put a string: ");
            String y = reader.nextLine();
            System.out.println(problem2.problem2(x, y));
        } else if (problem == 3) {
            System.out.println("Put a: ");
            double a = Double.parseDouble(reader.nextLine());
            System.out.println("Put b: ");
            double b = Double.parseDouble(reader.nextLine());
            System.out.println("Put c: ");
            double c = Double.parseDouble(reader.nextLine());
            System.out.println(problem3.problem3x1(a, b, c));
        } else if (problem == 4) {
             System.out.println("Type x1");
        double x1 = Double.parseDouble(reader.nextLine());
        System.out.println("Type y1:");
        double y1 = Double.parseDouble(reader.nextLine());
        System.out.println("Type x2:");
        double x2 = Double.parseDouble(reader.nextLine());
        System.out.println("Type y2:");
        double y2 = Double.parseDouble(reader.nextLine());
        System.out.println(problem4 (x1, y1, x2, y2));
        } else if (problem == 5) {
            System.out.println("Type a number");
        int n = Integer.parseInt(reader.nextLine());
           if (problem5(n)) {
                System.out.println("Prime");
            } else {
                   System.out.println("Composite");
            }
        } else if (problem == 6) {
            System.out.println("Type a year");
            int x = Integer.parseInt(reader.nextLine());
            System.out.println(problem6(x));
        } else if (problem == 7) {
            System.out.println("Type first number");
            int a = Integer.parseInt(reader.nextLine());
            System.out.println("Type second number");
         int b = Integer.parseInt(reader.nextLine());
         System.out.println(isMultiple(a, b));   
        } else {
                System.out.println("Not a valid problem");
    }
    }
    
}