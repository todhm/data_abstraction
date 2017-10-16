package ui;
import model.Coin;


public class Main {
    public static void main(String[] args){

        Coin c1 = new Coin();
        System.out.println(c1.checkStatus());
        c1.flip();
        System.out.println(c1.checkStatus());


    }

}
