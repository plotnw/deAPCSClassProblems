package wenapcs;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type x1");
        double x1 = Double.parseDouble(reader.nextLine());
        System.out.println("Type y1:");
        double y1 = Double.parseDouble(reader.nextLine());
        System.out.println("Type x2:");
        double x2 = Double.parseDouble(reader.nextLine());
        System.out.println("Type y2:");
        double y2 = Double.parseDouble(reader.nextLine());
        System.out.println(problem4 (x1, y1, x2, y2));
    }
    public static List<Double> problem4 (double x1, double y1, double x2, double y2) {
        List<Double> results = new ArrayList<>(Arrays.asList());
        if (x1 != x2) {
            double slope = ((y1-y2)/(x1-x2));
            double intercept = y1 - (slope * x1);
            results.add(slope);
            results.add(intercept);
        } else {
            ;
        }
        return results;
    }
}