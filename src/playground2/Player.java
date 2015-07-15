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
public class Player {
    private String name;
    private int anteSize = 50;
    private int walletSize = anteSize*3;
    private ArrayList<Card> hand;
    
    Player(){
        
    }
    
    Player(String name){
        this.name = name;
        this.anteSize = getAnteSize(); //this instance is set by TABLE when entering game
        this.walletSize = getWalletSize(); //this instance is set by TABLE when entering game
        this.hand = getHand(); 
    }
    
    Player(String name, int anteSize){
        this.name = name;
        this.anteSize = anteSize; //this instance is set by TABLE when entering game
        this.walletSize = getWalletSize(); //this instance is set by TABLE when entering game
        this.hand = getHand();
    }
    
    Player(String name, ArrayList<Card> hand){
        this.name = name;
        this.anteSize = getAnteSize(); //this instance is set by TABLE when entering game
        this.walletSize = getWalletSize(); //this instance is set by TABLE when entering game
        this.hand = getHand();
    }
    
    Player(String name, ArrayList<Card> hand, int anteSize, int walletSize){
        this.name = name;
        this.anteSize = getAnteSize(); //this instance is set by TABLE when entering game
        this.walletSize = getWalletSize(); //this instance is set by TABLE when entering game
        this.hand = getHand();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", anteSize=" + anteSize + ", walletSize=" + walletSize + '}';
    }

    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }



    /**
     * @return the anteSize
     */
    private int getAnteSize() {
        return anteSize;
    }

    /**
     * @param anteSize the anteSize to set
     */
    public void setAnteSize(int anteSize) {
        this.anteSize = anteSize;
    }

    /**
     * @return the walletSize
     */
    private int getWalletSize() {
        return walletSize;
    }

    /**
     * @param walletSize the walletSize to set
     */
    public void setWalletSize() {
        this.walletSize = anteSize*3;
        
    }

    /**
     * @return the hand
     */
    private ArrayList<Card> getHand() {
        return hand;
    }

    /**
     * @param hand the hand to set
     */
    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }
    
    
    
    
}
