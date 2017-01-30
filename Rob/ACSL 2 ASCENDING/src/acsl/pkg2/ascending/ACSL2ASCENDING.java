package acsl.pkg2.ascending;
import java.util.Scanner;
/**
 *
 * @author Robert Aburustum
 * @version January 29, 2017w
 */
public class ACSL2ASCENDING 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        boolean done = false;
        String input;
        String output;
        
        while (!done)
        {
            System.out.println("Please input the string of digits with a minimum length of one and a maximum length of 32. (Ex: 1234567) \nThe output will appear on the next line, followed by a line space. If done, type 'done'");
            input = reader.nextLine();
            output = "";
            
            if (input.equals("done")) {done = true;}
            else if (input.equals("")) {System.out.println("Invalid input, try again.");}
            else
            {
                output = next(input);
                System.out.println(output + "\n");
            }
        }
        System.out.println("All done.");
    }
    
    public static String reverse(String input)
    {
        String reverse = "";
        for (int x = input.length() - 1; x >= 0; x--)
            {
                reverse += input.charAt(x); 
            }
        return reverse;
    }
    
    public static String next(String input)
    {
        boolean running = true;
        boolean rev = true;
        String output = "";
        String reverse = "";
        int lastInt = 0;
        int place = 1;
        
        output += input.charAt(0) + " ";
        lastInt = Integer.valueOf(input.substring(0,1));

        input = input.substring(1);
        reverse = reverse(input);
        
        while (running)
        {
            if (rev && reverse.length() == 0) {running = false;}
            else if (!rev && input.length() == 0) {running = false;}
            else if (rev)
            {
                if (Integer.valueOf(reverse.substring(0, place)) > lastInt)
                {
                    lastInt = Integer.valueOf(reverse.substring(0, place));
                    output += lastInt + " ";
                    rev = false;
                    reverse = reverse.substring(place);
                    input = reverse(reverse);
                    
                    place = 1;
                }
                else
                {
                    if (place < reverse.length())
                    {
                        place++;
                    }
                    else
                    {
                        running = false;
                    }
                }
            }
            
            else
            {
                if (Integer.valueOf(input.substring(0, place)) > lastInt)
                {
                    lastInt = Integer.valueOf(input.substring(0, place));
                    output += lastInt + " ";
                    rev = true;
                    input = input.substring(place);
                    reverse = reverse(input);
                    
                    place = 1;
                }
                else
                {
                    if (place < input.length())
                    {
                        place++;
                    }
                    else
                    {
                        running = false;
                    }
                }
            }
        }
        return output;
    }
}