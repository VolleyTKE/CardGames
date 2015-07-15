/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playground2;

import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class Table {
    ArrayList<Player> player = new ArrayList<Player>();    
    private Deck deck1 = new Deck();
    Player player = new Player("Player");
    private int numberOfPlayers;
    
    
    
    
    Table(){
        this.deck1 = deck1;
    }
    
    public Table getPokerTable(int numberOfPlayers, int antSize){
        
        return table
    }

    /**
     * @return the deck1
     */
    public Deck getDeck1() {
        return deck1;
    }

    /**
     * @param deck1 the deck1 to set
     */
    public void setDeck1(Deck deck1) {
        this.deck1 = deck1;
    }

    /**
     * @return the numberOfPlayers
     */
    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    /**
     * @param numberOfPlayers the numberOfPlayers to set
     */
    public void setNumberOfPlayers(int numberOfPlayers) {
        if(!(numberOfPlayers<2) ||!(numberOfPlayers >5)){
            this.numberOfPlayers = numberOfPlayers;
        }
        else{
            System.out.println("Please pick a number between 2 or 5!");
        }
    }

        
        
        

    
    
}
