/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project.BlackJack;

import ca.sheridancollege.project.starterCode.Player;
import java.util.Scanner;

/**
 *
 * @author nivkp JUNE 2024
 */
public class BlackJackPlayer extends Player 
{
    
    Scanner in = new Scanner(System.in);
    private Object inp;

    public BlackJackPlayer(String name) 
    {
        super(name);
    }
    
    public boolean wantsToHit()
    {
        System.out.print(this.getName() + ", do you want to hit? (y or n)");
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
    public void play() 
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}