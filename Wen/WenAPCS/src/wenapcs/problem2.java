package wenapcs;
import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("char");
        char x = (reader.nextLine().charAt(0));
        System.out.println("word:");
        String y = reader.nextLine();
        System.out.println(problem2 (x, y));
    }
    public static int problem2 (char x, String y) {
        int sum = 0;
        for (int z =0;z < y.length();z++) {
            if (y.charAt(z) == x) {
                sum++;
            }
    } return sum;
    }
}