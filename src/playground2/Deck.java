package playground2;

import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris
 */
public class Deck {
        private ArrayList<Card> deck;
        Card card;


    private int cardsUsed;



    public Deck() {
        deck = new ArrayList<Card>();
        int cardCt = 0; 
        for ( int suit = 0; suit <= 3; suit++ ) {
            for ( int value = 2; value <= 14; value++ ) {
                card = new Card(value,suit);
                deck.add(card);
                cardCt++;
            }
        }
        
        cardsUsed = 0;
    }


    public void shuffle() {
        Collections.shuffle(deck);
        cardsUsed = 0;
    }


    public int cardsLeft() {
        return deck.size() - cardsUsed;
    }


    public Card dealCard() {
        if (cardsUsed == deck.size())
            throw new IllegalStateException("No cards are left in the deck.");
        cardsUsed++;
        return deck.get(cardsUsed -1);
        
    }

}
