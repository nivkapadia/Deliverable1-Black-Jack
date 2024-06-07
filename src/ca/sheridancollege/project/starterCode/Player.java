/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project.starterCode;

import ca.sheridancollege.project.BlackJack.Cards;
import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * 
 * @Modifiedby Niv Kapadia
 */
public abstract class Player 
{

    private String name; //the unique name for this player
    private ArrayList<Cards> hand;

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name)
    {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    /**
     * @return the player name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) 
    {
        this.name = name;
    }
    
    public void addCardToHand(Cards dealCard) 
    {
        this.hand.add(dealCard);
    }
    
    public ArrayList<Cards> getHand()
    {
        return this.hand;
    }
    
    public int calculateHandValue()
    {
        
        int value = 0;
        int aceCount = 0;
        for(Cards card: hand)
        {
            switch(card.getValue())
            {
                case TWO:
                    value += 2;
                    break;
                case THREE:
                        value += 3;
                        break;
                case FOUR:
                    value += 4;
                    break;
                case FIVE: 
                    value += 5;
                    break;
                case SIX:
                    value += 6;
                    break;
                case SEVEN: 
                    value += 7;
                    break;
                case EIGHT: 
                    value += 8;
                    break;
                case NINE: 
                    value += 9;
                    break;
                case TEN:
                    JACK: 
                    QUEEN: 
                    KING:
                    value += 10;
                    break;
                case ACE:
                {
                    value += 11;
                    aceCount++;
                }

            }
        }
        
        while (value > 21 && aceCount > 0)
        {
            value -= 10;
            aceCount--;
        }
        return value;
    }
    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();

}
