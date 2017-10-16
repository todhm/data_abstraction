package test;

import model.Coin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class CoinTest {
    Coin coin;

    @Before
    public void setUp(){ coin = new Coin(); }


    //Make sure we are not always getting the same response
    @Test
    public void testFlipHeadsAndTails(){
        int timesChanged = 0;
        int lastStatus = 1;
        for (int i=0; i<10; i++){
            coin.flip();
            int status = coin.checkStatus();
            System.out.println(status);
            if (status != lastStatus){
                timesChanged++;
                lastStatus = status;
            }
        }
        assertFalse(timesChanged==0);
    }


    //Test to ensure the same value isn't returned >10 times
    @Test
    public void testFlipRandomness(){
        int lastStatus = 1;
        int longestRunOfSameAnswer = 0;
        int currentRun = 0;
        for (int i=0; i<100; i++){
            coin.flip();
            int status = coin.checkStatus();
            System.out.println(status);
            if (status == lastStatus){
                currentRun++;
                if (currentRun > longestRunOfSameAnswer){
                    longestRunOfSameAnswer = currentRun;
                }
            }
            else {
                lastStatus = status;
                currentRun = 0;
            }
        }
        assertFalse(longestRunOfSameAnswer>10);
    }
}
