/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author nivkp
 */
public class BlackJackGame extends Game
{
    private DeckOfCards deck;
    private static BlackJackPlayer dealer = new BlackJackPlayer("Dealer");
    
    
    public BlackJackGame(String name) 
    {
        super(name);
        deck = new DeckOfCards();
    }

    @Override
    public void play() 
    {
        deck.shuffle();
        
        for(Player player: getPlayers())
        {
            player.addCardToHand(deck.dealCard());
            player.addCardToHand(deck.dealCard());
        }
        dealer.addCardToHand(deck.dealCard());
        dealer.addCardToHand(deck.dealCard());
        
        for(Player player: getPlayers())
        {
            while(((BlackJackPlayer) player).wantsToHit())
            {
                player.addCardToHand(deck.dealCard());
            }
        }
        
        while (dealer.calculateHandValue() < 17)
        {
            dealer.addCardToHand(deck.dealCard());
        }
        
        declareWinner();
        
        
    }

    @Override
    public void declareWinner() 
    {
        for(Player player: getPlayers())
        {
            int playerValue = player.calculateHandValue();
            int dealerValue = dealer.calculateHandValue();
            
            System.out.println(player.getName() + "'s hand: " + player.getHand() + " - Value: " + playerValue);
            System.out.println("Dealer's hand: " + dealer.getHand() + " - Value: " + dealerValue);

            if (playerValue > 21) 
            {
                System.out.println(player.getName() + " busts. Dealer wins!");
            }
            else if (dealerValue > 21) 
            {
                System.out.println("Dealer busts. " + player.getName() + " wins!");
            } 
            else if (playerValue > dealerValue) 
            {
                System.out.println(player.getName() + " wins!");
            } 
            else if (playerValue < dealerValue) 
            {
                System.out.println("Dealer wins!");
            } 
            else {
                System.out.println("It's a tie!");
            }
        }
    }
} 