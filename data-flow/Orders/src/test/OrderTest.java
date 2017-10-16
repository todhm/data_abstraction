package test;

import Model.Combo;
import Model.Order;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OrderTest {
    private Order testOrder;
    private ArrayList<Combo> ComboList;



    @Before
    public void setUP(){
        testOrder = new Order(1);
    }


    //Todo: Check setUP properly.
    @Test
    public void SettedProperly(){
        assertFalse(testOrder.checkComplete());
        assertEquals(testOrder.returnKitchenTicket(),1);

    }

    public void addOneCombo(int comboid, String comboname, int price) {
        int oldprice = testOrder.giveTotalPrice();
        Combo newCombo = new Combo(comboid,comboname,price);
        testOrder.addCombo(newCombo);
        assertTrue(testOrder.returnComboList().contains(newCombo));
        assertEquals(testOrder.giveTotalPrice(), oldprice + price);
    }


    //Todo: Check 1 combo added properly.
    @Test
    public void addOneProperly(){
        addOneCombo(1,"Pizza",100);


    }


    //Todo: Check multiple Combo added properly.
    @Test
    public void addMultiple(){
        addOneCombo(1,"Brazil",100);
        addOneCombo(2,"Jordan",200);
    }
    //Todo: Check Order change status properly.
    @Test
    public void changeOrderTest(){
        testOrder.changeStatus();
        assertTrue(testOrder.checkComplete());
        testOrder.changeStatus();
        assertFalse(testOrder.checkComplete());

    }



}
