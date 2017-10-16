package model;

import java.util.Random;

public class Coin {

    private int direction;

    public Coin(){
        this.direction = 1;
    }

    public void setDirection(int direct){
        this.direction = direct;

    }

    //Modifies: this
    //Effects: Revert the direction of Coin to head if it is tail and vice versa.
    public void flip(){
        Random ran = new Random();
        boolean b = ran.nextBoolean();
        if(b) {
            this.direction *= -1;
        }
    }

    //Requires: direction shouldn't be null.
    //Effects: Return the direction of current Coin .
    public int checkStatus(){
        return this.direction;
    }
}
