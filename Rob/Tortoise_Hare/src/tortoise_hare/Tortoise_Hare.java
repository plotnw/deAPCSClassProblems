// Robert Aburustum August 27, 2016
package tortoise_hare;
public class Tortoise_Hare 
{
    public static void main(String[] args) 
    {
        int hareMove;
        int tortMove;   //the move integers represent how much the tort and hare move each cycle
        int hare = 1;
        int tort = 1;   //the other 2 integers hold the place data of the tort and hare
        
        System.out.println("AND THEY'RE OFF!!");
        
        while (tort < 50 && hare < 50)  //while the tort AND hare are before spot 50 (the finish line) 
        {
            tortMove = Tortoise();      // movement of the tort is randomly determined by Tortoise()
            tort += tortMove;           // tort's place is changed based on the random output
            hareMove = Hare();          // repeat for hare
            hare += hareMove;
            
            if (tort < 1)
                tort = 1;               // if the tort slips to a place behind 1, move him back to 1
            else if (hare < 1)
                hare = 1;               // repeat for hare
            else if (tort > 50)
                tort = 50;              // if tort goes beyond 50 places, move him back to the finish line
            else if (hare > 50)
                hare = 50;              // repeat for hare
            
            //System.out.println("Tortoise moved " + tortMove + " places to spot " + tort);
            //System.out.println("Hare moved " + hareMove + " places to spot " + hare);
            
            System.out.println("\n");
            for (int n = 1; n <= 50; n++)
            {
                System.out.print("[");
                if (n == tort)
                    System.out.print("T");
                else if (n == hare)
                    System.out.print("H");
                else if (n == tort && n == hare)
                    System.out.print("OUCH!!");
                System.out.print("] ");             
                // this string of ifs creates the boxes and puts the H and T in them
            }
            //System.out.println("Tort: " + tort + " Hare: " + hare);
        }
        if (hare == 50 && tort == 50)
            System.out.println("\n\nIT'S A TIE!!");  // if hare and tort are at the finish line, its a tie
        else if (hare == 50)
            System.out.println("\n\nHARE WINS!!");   // if hare is at finish line, hare wins
        else
            System.out.println("\n\nTORTOISE WINS!!");   // otherwise, tort wins
    }
    public static int Tortoise()
    {
        int random = (int)(Math.random() * 10 + 1); //creates random int between 1 and 10
        
        if (random == 1 || random == 2 || random  == 3 || random == 4 || random == 5)   // if the random is 1-5, return a value of 3
            return 3;
        else if (random == 6 || random == 7 || random == 8) // if the random is 6-8, return a value of 1
            return 1;
        else    //otherwise, return a value of -6
            return -6;
    }
    public static int Hare()
    {
        int random = (int)(Math.random() * 10 + 1); //generates a random int between 1 and 10
        
        if (random == 1 || random == 2) // if random is 1 or 2 return 9
            return 9;
        else if (random == 3 || random == 4 || random ==5)  // if random is between 3 and 5, return 1 
            return 1;
        else if (random == 6)   // if random is 6, return -12
            return -12;
        else if (random == 7 || random == 8)    // if random is 7 or 8, return -2
            return -2;
        else    // otherwise, return 0
            return 0;
    }
}