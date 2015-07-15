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
    Player player1 = new Player("Player1");
    int numberOfPlayers;
    
    
    
    
    Table(){
        this.deck1 = deck1;
    }
    
    Table(){
        
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

        
        
        

    
    
}
