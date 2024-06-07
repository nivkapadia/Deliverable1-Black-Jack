/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author nivkp
 * @modifiedby kapadniv
 */
public class Cards extends Card {

    public Cards(SUITS s, VALUES v) {
    }

    public enum SUITS
    {
        HEARTS, DIAMONDS, SPADES, CLUBS
    }
    
    public enum VALUES
    {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
        JACK, KING, QUEEN, ACE
    }
    
    private SUITS suit;
    private VALUES value;
    
    public void Cards(SUITS suit, VALUES value)
    {
        this.suit = suit;
        this.value = value;
    }
    
    public VALUES getValue()
    {
        return this.value;
    }
    
    public SUITS getSUIT()
    {
        return this.suit;
    }
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
