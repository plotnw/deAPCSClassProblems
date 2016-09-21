package myfirstprogram;
/**
 * Playing with data types and stuff
 * @author Robert Aburustum
 * @version Sept. 2016
 */
import java.util.Random;
public class Primitives 
{
    public static void main(String [] args)
    {
        /*int n = 72;
        double x = 4.3;
        System.out.println("n = "+ n);
        System.out.println("x = " + x);*/
        //double n = (double)100/3;
        //System.out.println(n);
        //System.out.printf("n = %8.2f", n);
        long n = 1;
        for (int c = 0; c < 100; c++)
        {
            n *= 2;
            System.out.println(n);
        }
    }
}