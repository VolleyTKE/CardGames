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
public class Hand {
         private ArrayList<Card> hand; 


    public Hand() {
        hand = new ArrayList<Card>();
    }


    public void clear() {
        hand.clear();
    }


    public void addCard(Card c) {

        hand.add(c);
    }


    public void removeCard(Card c) {
        hand.remove(c);
    }


    public void removeCard(int position) {

        hand.remove(position);
    }


    public int getCardCount() {
        return hand.size();
    }


    public Card getCard(int position) {

        return hand.get(position);
    }
    
    
    public ArrayList<Card> getHand() {
                for (int i = 0; i < 5; i++) {
            hand.indexOf(i);
            
//            System.out.println(hand.getCard(i).toString());
        }

        return hand;
    }


    public void sortBySuit() {
        ArrayList<Card> newHand = new ArrayList<Card>();
        while (hand.size() > 0) {
            int pos = 0;  
            Card c = hand.get(0); 
            for (int i = 1; i < hand.size(); i++) {
                Card c1 = hand.get(i);
                if ( c1.getSuit() < c.getSuit() ||
                        (c1.getSuit() == c.getSuit() && c1.getValue() < c.getValue()) ) {
                    pos = i;
                    c = c1;
                }
            }
            hand.remove(pos);
            newHand.add(c);
        }
        hand = newHand;
    }


    public void sortByValue() {
        ArrayList<Card> newHand = new ArrayList<Card>();
        while (hand.size() > 0) {
            int pos = 0;  
            Card c = hand.get(0);  
            for (int i = 1; i < hand.size(); i++) {
                Card c1 = hand.get(i);
                if ( c1.getValue() < c.getValue() ||
                        (c1.getValue() == c.getValue() && c1.getSuit() < c.getSuit()) ) {
                    pos = i;
                    c = c1;
                }
            }
            hand.remove(pos);
            newHand.add(c);
        }
        hand = newHand;
    }
    
}
