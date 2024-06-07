/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author nivkp
 */
public class Init_Black_Jack {
    BlackJackGame game = new BlackJackGame("Blackjack");
    ArrayList<Player> gamePlayers = new ArrayList<>();
    gamePlayers.add(new Player("Player 1"));
    gamePlayers.add(new Player("Player 2"));
    
    game.setPlayers(gamePlayers);
    game.play();
}
