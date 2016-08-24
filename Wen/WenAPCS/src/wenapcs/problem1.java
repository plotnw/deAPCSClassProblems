package wenapcs;
import java.util.Scanner;
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