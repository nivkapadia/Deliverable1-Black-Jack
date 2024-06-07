/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project.BlackJack;

import ca.sheridancollege.project.starterCode.Game;
import ca.sheridancollege.project.starterCode.Player;

/**
 *
 * @author nivkp JUNE 2024
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
        System.out.println("Shuffling deck...");
        deck.shuffle();
        
        try {
            // Adding a 2-second delay
            Thread.sleep(2000);
        } 
        catch (InterruptedException e){}
        System.out.println("Deck Shuffled");
        
        System.out.println("Dealing cards to each player.");
        for(Player player: getPlayers())
        {
            player.addCardToHand(deck.dealCard());
            player.addCardToHand(deck.dealCard());
        }
        dealer.addCardToHand(deck.dealCard());
        dealer.addCardToHand(deck.dealCard());
        
        System.out.println("Cards Dealt");
        System.out.println("Dealer's first card: " + dealer.getHand().get(0));
        
        for(Player player: getPlayers())
        {
            System.out.println(player.getName()  + "'s Hand: " + player.getHand());
        }
        
        for(Player player: getPlayers())
        {
            while(((BlackJackPlayer) player).wantsToHit())
            {
                player.addCardToHand(deck.dealCard());
                System.out.println("Card Dealt: " + player.getHand().get(player.
                        getHand().size() - 1));
                System.out.println(player.getName() + "'s Cards now: " + 
                        player.getHand());
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