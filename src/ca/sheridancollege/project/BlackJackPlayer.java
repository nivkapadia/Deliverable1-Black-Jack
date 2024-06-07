/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author nivkp
 */
public class BlackJackPlayer extends Player {
    
    Scanner in = new Scanner(System.in);
    private Object inp;

    public BlackJackPlayer(String name) {
        super(name);
    }
    
    public boolean wantsToHit()
    {
        System.out.print("Do you want to hit? (y or n)");
        do
        {
            inp = in.next();
            if (inp.equals("y") || inp.equals("yes"))
            {
                return true;
            }
            else if (inp.equals("n") || inp.equals("no"))
            {
                return false;
            }
        }
        while(!inp.equals("y") || !inp.equals("n"));
        return false;
    }
    
    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
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

}
