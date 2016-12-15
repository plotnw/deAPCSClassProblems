package acsl.pkg1.agram;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Robert Aburustum
 * @version December 11, 2016
 */
public class ACSL1AGRAM 
{
    final static char[] values = {'A', '2', '3', '4', '5', '6', '7', '8', '9','T', 'J', 'Q', 'K'};
    
    public static void main(String[] args) 
    {   
        boolean done = false;
        while (!done)
        {
            Scanner reader = new Scanner(System.in);
            String cardToPlay;
         
            System.out.println("Please input the leading card followed by the 5 cards held by the dealer. "
                      + "Please put a space between each 2 character set. "
                    + "\nYou may leave the commas in that are provided by ACSL for test input so long as "
                    + "spaces are left after each comma. ALL letters should be uppercase. \n(Ex: 5D, 2D, 6H, 9D, TD, 6H)If you are done, type 'done' :");
            String[] cards = reader.nextLine().toUpperCase().split(" ");
            if (cards[0].equals("DONE")) {done = true;}
            else
            {    
                if (hasSuit(cards))
                {
                    cards = removeNonSuit(cards);
        
                    if (hasHigherCard(cards))
                    {
                        cardToPlay = highestValue(cards);
                    }
                    else
                    {
                        cardToPlay = lowestCard(cards);
                    }
                    //System.out.println(cardToPlay.substring(0,2));
                }
                else
                {   
                    cardToPlay = lowestCard(cards);
                    //System.out.println(cardToPlay.substring(0,2));
                }
                System.out.println(cardToPlay.substring(0,2));
                System.out.println("________________________________________________________________________________________________________________________________________________");
            }
        }
        System.out.println("All done.");
    }
    //Suits: Spade, Heart, Club, Diamond
    //Values: Ace 2 3 4 5 6 7 8 9 Ten Jack Queen King
    public static String getSuit(String input)
    {
        if (input.charAt(1) == 'S')
            return "S";
        if (input.charAt(1) == 'H')
            return "H";
        if (input.charAt(1) == 'C')
            return "C";
        return "D";
    }
    
    public static boolean hasSuit(String[] cards)
    {
        String leadSuit = getSuit(cards[0]); 
        for (int x = 1; x < cards.length; x++)
        {
            if (cards[x].contains(leadSuit))
            {
                return true;
            }
        }
        return false;
    }
    
    public static String lowestCard(String[] cards)
    {
        String lowestCard = "";
        int lowestCardPlace = 100;
        
        for (int x = 1; x < cards.length; x++)
        {
            for (int y = 0; y < values.length; y++)
            {
                if (cards[x].charAt(0) == values[y] && y < lowestCardPlace)
                {
                    lowestCardPlace = y;
                    lowestCard = cards[x];
                }
                if (cards[x].charAt(0) == values[y] && y == lowestCardPlace)
                {
                    if (getSuit(cards[x]).equals("C"))
                        lowestCard = cards[x];
                    else if (getSuit(lowestCard).equals("C")) {}
                        
                    else if (getSuit(cards[x]).equals("D"))
                        lowestCard = cards[x];
                    else if (getSuit(lowestCard).equals("D")) {}
                    
                    else if (getSuit(cards[x]).equals("H"))
                        lowestCard = cards[x];
                    else if (getSuit(lowestCard).equals("H")) {}
                    
                    else if (getSuit(cards[x]).equals("S"))
                        lowestCard = cards[x];
                }
            }
        }
        return lowestCard;
    }
    
    public static String[] removeNonSuit(String[] cards)
    {
        String leadSuit = getSuit(cards[0]);
        ArrayList<String> goodCards = new ArrayList<>();
        
        for (String card : cards) 
        {
            if (card.contains(leadSuit)) 
            {
                goodCards.add(card);
            } 
        }
        String[] bestCards = new String[goodCards.size()];
        for (int x = 0; x < goodCards.size(); x++)
        {
            bestCards[x] = goodCards.get(x);
        }
        return bestCards;
    }
    
    public static boolean hasHigherCard(String[] cards)
    {
        int leadValue = getValue(cards[0]);
        
        for (int x = 1; x < cards.length; x++) 
        {
            if (getValue(cards[x]) > leadValue)
                return true;
        }
        return false;
    }
    
    public static int getValue(String card)
    {
        char cardValue = card.charAt(0);
        for (int x = 0; x < values.length; x++)
        {
            if (cardValue == values[x])
                return x;
        }
        return 0;
    }
    
    public static String highestValue(String[] cards)
    {
    String bestCard = "";
    int bestValue = 100;
    int nextValue;
    
    int minimumValue = getValue(cards[0]);
    
    for (int x = 1; x < cards.length; x++)
    {
        nextValue = getValue(cards[x]);
        if ((nextValue < bestValue) && nextValue > minimumValue)
        {
            bestValue = nextValue;
            bestCard = cards[x];
        }
    }
    return bestCard;
    }
}