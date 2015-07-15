/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playground2;

/**
 *
 * @author Chris
 */
public class Player {
    private String name;
    //private int numberOfPlayers = 0; put in DIFFERENT CLASS!
    private int anteSize = 50;
    private int walletSize = anteSize*3;
    private Hand hand;
    
    Player(String name){
        this.name = name;
        this.anteSize = anteSize; //this instance is set by TABLE when entering game
        this.walletSize = walletSize;//this instance is set by TABLE when entering game
        this.hand = hand;
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

//    /**PUT IN SEPERATE CLASS!!!
//     * @return the numberOfPlayers
//     */
//    public int getNumberOfPlayers() {
//        return numberOfPlayers;
//    }
//
//    /**
//     * @param numberOfPlayers the numberOfPlayers to set
//     */
//    public void setNumberOfPlayers(int numberOfPlayers) {
//        this.numberOfPlayers = numberOfPlayers;
//    }

    /**
     * @return the anteSize
     */
    public int getAnteSize() {
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
    public int getWalletSize() {
        return walletSize;
    }

    /**
     * @param walletSize the walletSize to set
     */
    public void setWalletSize(int walletSize) {
        this.walletSize = walletSize;
    }

    /**
     * @return the hand
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * @param hand the hand to set
     */
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    
    
    
    
}
